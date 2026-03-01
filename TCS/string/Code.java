import java.util.HashSet;
import java.util.Set;

public class Code {
    public static void main(String[] args) {
        String a = "ababb";
        String b = "abaaa";
        int n = a.length();
        // If strings are equal
        if (a.equals(b)) {
            System.out.println(1);
            return;
        }

        Set<Character> aSet = new HashSet<>();
        Set<Character> bSet = new HashSet<>();
        Set<Character> diffBSet = new HashSet<>();

        // Store all characters of a and b
        for (int i = 0; i < n; i++) {
            aSet.add(a.charAt(i));
            bSet.add(b.charAt(i));
        }

        // Collect differing characters from b
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffBSet.add(b.charAt(i));
            }
        }

        // Check if transformation is possible
        for (char ch : diffBSet) {
            if (!aSet.contains(ch)) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(diffBSet.size());

    }
}