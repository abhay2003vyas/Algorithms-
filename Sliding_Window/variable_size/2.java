// Longest K unique characters substring

import java.util.*;
class VS2{
    public static int longestkSubstr(String s, int k) {
        // code here
        int i = 0;
        int j = 0;
        int max = -1;
        HashMap<Character,Integer>map = new HashMap<>();
        while(j<s.length()){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1); 
            if(map.size()  < k){
                j++;
            }
            else if(map.size() == k){
                max = Math.max(max,j-i+1);  // Compare the highest length of k unique characters
                j++;
            }
            else if(map.size() > k){
                while(map.size() > k){
                     char x = s.charAt(i);
                     map.put(x, map.get(x) - 1);
                     if(map.get(x)==0){
                     map.remove(x);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s, k));
    }
}