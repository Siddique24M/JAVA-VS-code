import java.util.HashSet;

public class StringSwitch {
    public static void main(String[] args) {

        String a = "ababbca";
        String b = "abaaacc";

        if (a.equals(b)) {
            System.out.println(1);
            return;
        }

        HashSet<Character> aSet = new HashSet<>();
        HashSet<Character> diffSet = new HashSet<>();

        // Store all characters of a
        for (int i = 0; i < a.length(); i++) {
            aSet.add(a.charAt(i));
        }

        // Find differing characters from b
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffSet.add(b.charAt(i));
            }
        }

        // Validate transformation possibility
        for (char ch : diffSet) {
            if (!aSet.contains(ch)) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(diffSet.size());
    }

}
