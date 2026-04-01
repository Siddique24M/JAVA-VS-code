import java.util.HashMap;

public class MinSwap {
    public static int minSwap(int[] A, int[] B){
        int n = A.length;
        HashMap <Integer,Integer> pos = new HashMap<>();
        for(int i=0; i<n; i++){
            pos.put(B[i], i);
        }
        boolean[] visited = new boolean[n];
        int swap = 0;
        for(int i=0; i<n; i++){
            if(visited[i] || pos.get(A[i])==1)
                continue;
        int cycle_size=0;
        int j=i;
        while(!visited[j]){
            visited[j]=true;
            j=pos.get(A[j]);
            cycle_size++;
        }
        if(cycle_size>1)
            swap+=(cycle_size-1);
        }
        return swap;
    }
    public static void main(String[] args) {
        int[] A = {10,20,50,40};
        int[] B = {50,20,40,10};
        System.out.println(minSwap(A, B));
    }
}
