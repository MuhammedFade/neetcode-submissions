class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[] {};
        }


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int differ = target - nums[i];

            if(map.containsKey(differ)){
                int j = map.get(differ);

                return new int[] {Math.min(i, j), Math.max(i, j)};
            }

            map.put(nums[i], i);

        }

        return new int[] {};
        
    }
}
