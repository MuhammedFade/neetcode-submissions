class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums == null || nums.length == 0 || k == 0)
        return new int[] {};


        Map<Integer, Integer> map = new HashMap<>();

        for(Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));


        int[] result = new int[k];

        for (int i = 0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
        
    }
}
