//silent == listen
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(check("silent","listen"));
    }
    public static boolean check(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);   //it checks for the content of the array and not the reference
    }
}
