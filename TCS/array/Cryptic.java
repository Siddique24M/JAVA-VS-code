import java.util.ArrayList;
import java.util.List;

public class Cryptic {
    static boolean isPalindrome(int num){
        int original = num, reverse=0;
        while(num>0){
            reverse = reverse*10+num%10;
            num/=10; 
        }
        return original == reverse;
    }
    static boolean isUnique(int num){
        boolean[] visited = new boolean[10];
        while (num>0) {
            int digit = num%10;
            if(visited[digit]){
                return false;
            }
            visited[digit]=true;
            num/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<Integer>(); 
            for(int i=0; i<10; i++){
                if(i%7==0 &&
                    i%5!=0 &&
                    isPalindrome(i) &&
                    isUnique(i)){
                        result.add(i);
                    }
            }
            if(result.size()==0){
                System.out.println(-1);
            }else{
                for(int num : result){
                    System.out.println(num + " ");
                }
            }
    }
}
