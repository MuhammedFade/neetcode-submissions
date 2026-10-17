class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[] {};
        }

        // 1. Build the frequency map (counts how many times each number appears)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Put all the unique numbers from the map into a List
        List<Integer> list = new ArrayList<>(map.keySet());

        // 3. Sort the list based on their frequencies in descending order 
        // (Highest frequency comes first)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // 4. Grab the top k elements and put them into an int array to return
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}