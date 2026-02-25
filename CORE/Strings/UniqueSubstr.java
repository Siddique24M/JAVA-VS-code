import java.util.HashSet;
public class UniqueSubstr {
    public static int longestUniqueSubstringLength(String s) {
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
    public static void main(String[] args) {
        int n = longestUniqueSubstringLength("abcabcbb");
        System.out.println("the max length is " + n);
    }
}

