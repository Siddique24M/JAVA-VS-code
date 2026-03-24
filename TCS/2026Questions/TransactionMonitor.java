import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TransactionMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> seen = new HashSet<>();
        int prevTime = -1;
        for(int i=0; i<n; i++){
            String sender = sc.next(); 
            String reciever = sc.next(); 
            int timestamp = sc.nextInt(); 
            int amount = sc.nextInt(); 

            //rule 1- duplicate check
            String key = sender + "-" + reciever + "-" + amount;
            if(seen.contains(key)){
                System.out.println("Error: Duplicate Transaction");
                return;
            }
            seen.add(key);

            //rule 2- fraud detecction
            if(prevTime !=-1 && (timestamp-prevTime>60)){
                System.out.println("fraud detected");
                return;
            }
            prevTime = timestamp;
            sc.close();
        }
        System.out.println("All transaction valid");
    }
}
