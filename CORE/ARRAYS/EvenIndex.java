public class EvenIndex {
      public static void main(String[] args) {
        int[] a = { 12, 47, 56, 96, 102};
        for(int i = 0; i < a.length; i++){
            if(i%2 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
