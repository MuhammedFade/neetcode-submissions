class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // Key: The sorted string (e.g., "act")
        // Value: A list of original words that match that sorted string (e.g., ["act", "cat"])
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Convert the string to a char array, sort it, and turn it back into a String
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // 2. If this sorted key is brand new, create a new empty list for it
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // 3. Add the original string to its matching group
            map.get(sortedKey).add(s);
        }

        // 4. Return all the grouped lists from the map's values
        return new ArrayList<>(map.values());
    }
}