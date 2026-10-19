class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums == null || nums.length == 0){
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (Integer i : nums){
            if (set.contains(i))
            return true;

            set.add(i);
        }

        return false;
        
    }
}