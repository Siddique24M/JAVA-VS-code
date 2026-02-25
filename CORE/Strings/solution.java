import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String max = "";
        for(int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                String str = s.substring(i,j);
                if(str.length()>max.length() && isValid(str)){
                    max = str;
                }
            }
        }
        System.out.println(max.length());
    }
    public static boolean isValid(String s){
        // for(int i=0; i<s.length(); i++){
        //     for(int j= i+1; j<s.length(); j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        HashSet<Character> hs = new HashSet<Character>();
        for(char ch : s.toCharArray()){ 
            if(hs.contains(ch)){
                return false;
            }
            hs.add(ch);
        }
        return true;
    }
}

/*import java.util.HashSet;

public class Solution {
    public int longestUniqueSubstringLength(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            // If duplicate, shrink window from left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(ch);

            // Update max length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}*/