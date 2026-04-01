public class maxProductSubset {
    public static long maxProduct(int[] arr){
        int n= arr.length;

        if(n==1) return arr[0];

        int maxNeg = Integer.MIN_VALUE;
        int countNeg = 0;  //to count no of negatives
        int countZero = 0; //to count no of zeros
        long product = 1;

        for(int x : arr){
            if(x==0){
                countZero++;
                continue;  
            }
            if(x<0){
                countNeg++;
                maxNeg = Math.max(maxNeg, x);
            }
            product*=x;   //multiply all product in array
        }
        if(countZero==n) return 0;  //if all elements are zero return 0

        if(countNeg%2==1){      //check countNegative is odd 
            if(countNeg==1 && countZero+countNeg==n){   //if 1 negative and rest are zero return 0
                return 0;
            }
            product /= maxNeg;      // return product remove max negative
        }
        return product;
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4};
        System.out.println(maxProduct(arr));
    }
}
