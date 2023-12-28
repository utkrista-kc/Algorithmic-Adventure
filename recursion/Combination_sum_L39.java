class Solution {
    List<List<Integer>> finalCombination = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombinations(0, candidates, 0, target, new ArrayList<>());
        return finalCombination;
    }

    public void findCombinations(int index, int[] candidates, int currSum, int target, List<Integer> temp) {
        // Bounding condition
        if (currSum > target) {
            return;
        }
        // Base case
        if (index == candidates.length) {
            if (currSum == target) {
                finalCombination.add(new ArrayList<>(temp));
            }
            return;
        }
        // Inclusion
        currSum += candidates[index];
        temp.add(candidates[index]);
        findCombinations(index, candidates, currSum, target, temp);
        currSum -= candidates[index];
        temp.remove(temp.size() - 1);

        // Exclusion
        findCombinations(index + 1, candidates, currSum, target, temp);
    }
}