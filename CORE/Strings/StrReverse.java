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
    String[] arr = {"Sid", "Shrutika"};
    // return new String(arr[1]);     return String Array value
    char[] ch = arr[0].toCharArray();   //converting string array to char array
    for(int i=0; i<ch.length; i++)
    {
        System.out.print(ch[i] + " ");
    }
    System.out.println();
    return new String(ch);      //returns char array value
   }
}
