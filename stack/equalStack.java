// hackerrank

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY h1
     * 2. INTEGER_ARRAY h2
     * 3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int height = 0;
        int h1Sum = 0;
        int h2Sum = 0;
        int h3Sum = 0;

        for (int i = 0; i < h1.size(); i++) {
            h1Sum += h1.get(i);
        }
        for (int i = 0; i < h2.size(); i++) {
            h2Sum += h2.get(i);
        }
        for (int i = 0; i < h3.size(); i++) {
            h3Sum += h3.get(i);
        }

        if (h1Sum == h2Sum && h1Sum == h3Sum) {
            return h1Sum;
        }
        while (h1.size() != 0 && h2.size() != 0 && h3.size() != 0) {
            int maxHeight = Math.max(Math.max(h1Sum, h2Sum), h3Sum);
            int firstElement = -1;
            if (maxHeight == h1Sum) {
                firstElement = h1.get(0);
                h1.remove(0);
                h1Sum -= firstElement;
            } else if (maxHeight == h2Sum) {
                firstElement = h2.get(0);
                h2.remove(0);
                h2Sum -= firstElement;
            } else if (maxHeight == h3Sum) {
                firstElement = h3.get(0);
                h3.remove(0);
                h3Sum -= firstElement;
            }

            if (h1Sum == h2Sum && h1Sum == h3Sum) {
                height = h1Sum;
                break;
            }
        }
        return height;

    }

}