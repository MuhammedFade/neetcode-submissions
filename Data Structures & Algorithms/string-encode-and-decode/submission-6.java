class Solution {

    public String encode(List<String> strs) {

        if (strs == null)
        return "";

        StringBuilder string = new StringBuilder();

        for (String s : strs){
            string.append(s.length()).append('#').append(s);
        }

        return string.toString();

    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        if (str == null)
        return list;

        int i = 0;

        while (i < str.length()){
            int j = i;

            while (str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));


            String word = str.substring(j + 1, j + 1 + length);

            list.add(word);

            i = j + 1 + length;
        }

        return list;

    }
}
