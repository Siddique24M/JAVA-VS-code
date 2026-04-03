import java.util.Scanner;
import java.util.ArrayList;
public class VehicleCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        String line = sc.nextLine();
        String[] nums = line.trim().split("\\s+");
        for(String s: nums){
            int x = Integer.parseInt(s);
            arr.add(x);
        }
        int count =0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>=n){
                count++;
            }
        }
        System.out.println(count);
    }
}
