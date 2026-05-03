class Solution {
    public boolean isAnagram(String s, String t) {
        int [] charArray = new int[26];
        for( char ch : s.toCharArray()) charArray[ch - 'a']++;
        for( char ch : t.toCharArray()) charArray[ch - 'a']--;

        for(int i : charArray)
            if(i!=0)
                return false;

        return true;
    }
}
