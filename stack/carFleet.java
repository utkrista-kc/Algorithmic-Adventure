class Car {
    int position;
    double speed;

    Car(int position, double speed) {
        this.position = position;
        this.speed = speed;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        if (n < 2) {
            return n;
        }
        System.out.println(n);
        Car[] cars = new Car[n];
        Stack<Double> helperStack = new Stack<Double>();
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        Arrays.sort(cars, new Comparator<Car>() {
            public int compare(Car a, Car b) {
                return a.position - b.position;
            }
        });
        for (int i = n - 1; i >= 0; i--) {
            double timeToTarget = (target - cars[i].position) / cars[i].speed;
            if (!(!helperStack.isEmpty() && timeToTarget <= helperStack.peek())) {
                helperStack.push(timeToTarget);
            }
        }
        return helperStack.size();
    }
}

/*
 * Time complexity: O(nlogn)
 * Space complexity: O(n)
 */