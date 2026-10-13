class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Found the pair, return smaller index first
                int j = map.get(complement);
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }

            map.put(nums[i], i); // store current number with index
        }

        return new int[]{}; // should never reach here (problem guarantees one solution)
    }
}
