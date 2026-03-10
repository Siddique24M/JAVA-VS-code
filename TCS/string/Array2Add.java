public class Array2Add {
    public static void main(String[] args) {
        int[] arr = {2,5,7,6,3};
        int X = 20;
        int Y = 50;
        int count =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // if(arr[i]!=arr[j]) {
                    String s = String.valueOf(arr[i])+ String.valueOf(arr[j]);
                    int num = Integer.parseInt(s);

                    if(num>=X && num<=Y)
                        count++;  
                // }
            }
        }
        System.out.println(count);
    }
}
