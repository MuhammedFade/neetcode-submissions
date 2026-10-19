class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }


        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){

            char[] info = s.toCharArray();
            Arrays.sort(info);
            String sortedWord = new String(info);




            if (!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

           

            map.get(sortedWord).add(s);

        }

        return new ArrayList<>(map.values());

        
        
    }
}
