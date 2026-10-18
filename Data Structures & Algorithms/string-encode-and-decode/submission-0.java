
public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null) return "";
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) return result;
        
        int i = 0;
        while (i < s.length()) {
            // Find the position of the delimiter '#'
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            
            // Parse the length of the string
            int length = Integer.parseInt(s.substring(i, j));
            
            // Extract the actual string using the length
            String str = s.substring(j + 1, j + 1 + length);
            result.add(str);
            
            // Move our pointer 'i' to the start of the next length prefix
            i = j + 1 + length;
        }
        
        return result;
    }
}