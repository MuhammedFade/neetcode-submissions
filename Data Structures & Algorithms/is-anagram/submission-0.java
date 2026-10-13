class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // Convert to char arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort both
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare
        return Arrays.equals(sArr, tArr);
    }
}
