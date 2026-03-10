public class CharacterMirror {
    public static void main(String[] args) {
        char ch = 'b';
        char mirroredChar = mirrorCharacter(ch);
        System.out.println("The mirror of '" + ch + "' is: " + mirroredChar);
    }

    public static char mirrorCharacter(char chr) {
        if (chr >= 'a' && chr <= 'z') {
            return (char) ('z' - (chr - 'a'));  // Mirror for lowercase letters explicitly typed as char
        } else if (chr >= 'A' && chr <= 'Z') {
            return (char) ('Z' - (chr - 'A'));  // Mirror for uppercase letters explicitly typed as char
        } else {
            return chr;  // Non-alphabetic characters remain unchanged
        }
    }
}
