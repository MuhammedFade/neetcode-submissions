class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return new int[] {};
       }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int diffrence = target - nums[i];

            if(map.containsKey(diffrence)){

                int j = map.get(diffrence);

                return new int[] {Math.min(i, j), Math.max(i, j)};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
        
    }
}

