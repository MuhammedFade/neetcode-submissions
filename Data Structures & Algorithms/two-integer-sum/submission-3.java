class Solution {
    public int[] twoSum(int[] nums, int target) {

       
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int difference = target - nums[i];

            if (map.containsKey(difference)){

                int j = map.get(difference);
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }

            map.put(nums[i], i);

        }

        return new int[] {};
    }
}
