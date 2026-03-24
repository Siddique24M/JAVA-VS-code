import java.util.*;

public class TransactionMonitorHardcoded {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList(
            "a b 10 100",
            "c d 50 200",
            "e f 100 300"
        );

        // Solution obj = new Solution();
        System.out.println(validateTransactions(transactions));
    }
    public static String validateTransactions(List<String> transactions) {

        Set<String> seen = new HashSet<>();
        int prevTime = -1;

        for (String transaction : transactions) {

            String[] parts = transaction.split(" ");

            String sender = parts[0];
            String receiver = parts[1];
            int timestamp = Integer.parseInt(parts[2]);
            int amount = Integer.parseInt(parts[3]);

            // Rule 1 - duplicate check
            String key = sender + "-" + receiver + "-" + amount;
            if (seen.contains(key)) {
                return "Error: Duplicate Transaction";
            }
            seen.add(key);

            // Rule 2 - fraud detection
            if (prevTime != -1 && (timestamp - prevTime > 60)) {
                return "Fraud detected";
            }

            prevTime = timestamp;
        }

        return "All transaction valid";
    }
}
