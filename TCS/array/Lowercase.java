public class Lowercase {
    public static void main(String[] args) {
        String s1 = "SidDIque";
        String s2 = " ";
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)>=65 && s1.charAt(i)<=90){
                s2 = s2 + (char) (s1.charAt(i)+32);
            }
            else
                s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}
