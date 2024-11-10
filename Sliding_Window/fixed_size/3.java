// Count of Occurrence of Anagrams


import java.util.*;
class P3{
    public static int getAnagrams(String pat , String txt){
        int i = 0;
        int j = 0;
        int ans = 0;
        int k = pat.length();
        Map<Character, Integer> charMap = new HashMap<>();
        
        for (char c : pat.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        int count = charMap.size();
        
        while (j < txt.length()) {
            if (charMap.containsKey(txt.charAt(j))) {
                charMap.put(txt.charAt(j), charMap.get(txt.charAt(j)) - 1);
                if (charMap.get(txt.charAt(j)) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (charMap.containsKey(txt.charAt(i))) {
                    charMap.put(txt.charAt(i), charMap.get(txt.charAt(i)) + 1);
                    if (charMap.get(txt.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";
        int count = getAnagrams(pat, txt);
        System.out.println(count);
    }
}