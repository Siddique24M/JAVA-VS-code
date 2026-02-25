public class StringCap {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("world");
        System.err.println(capital(s1) + " "+ capital(s2));
    }
    public static String capital(String str){
        return str.substring(0, 1).toUpperCase()+str.substring(1);
        
    }
}
