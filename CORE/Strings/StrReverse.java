public class StrReverse {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Hello");

        // for(int i = 0; i< sb.length()/2; i++){
        //     int front = i;
        //     int back = sb.length()-1-i;

        //     char frontChar = sb.charAt(front);
        //     char backchar = sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontChar);
        // }
        System.out.println(reverse("hello"));
        System.out.println(Arr1());
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i< sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);
        }
        return sb.toString();
   }
   public static String Arr1(){
    char[] arr = {'S', 'I', 'D'};
    return arr.toString();
   }
}
