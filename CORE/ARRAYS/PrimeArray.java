public class PrimeArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 9, 17};
        for(int i = 0; i<a.length; i++){
            int count = 0;
            for (int j=1; j<=a[i]; j++){
                if(a[i]%j == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.println(a[i] + " is prime");
            }
            else{
                System.out.println(a[i] + " is not prime");
            }
        }
    }
    
}
