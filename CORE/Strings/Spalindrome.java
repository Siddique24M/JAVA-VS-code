public class Spalindrome {
    public static void main(String[] args) {
        System.out.println(Check("madam"));
    }
    public static boolean Check(String sb){
        int left=0; 
        int right=sb.length()-1;
        while(left<right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
