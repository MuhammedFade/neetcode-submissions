class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> pair = new HashMap<>();

       for (int i = 0; i < nums.length; i++){
        int complement = target - nums[i];
        if (pair.containsKey(complement)){
            int j = pair.get(complement);  
;
            return new int[] {Math.min(i, j), Math.max(i, j)};
        }
        pair.put(nums[i], i);

       }
       return new int[]{};
    }
}
