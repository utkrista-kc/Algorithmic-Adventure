// hackerrank

public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> result = new ArrayList<>(a.size());
    for(int i=a.size() - 1;i>=0;i--) {
        result.add(a.get(i));
    }
    return result;
    }