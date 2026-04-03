import java.util.Arrays;
import java.util.Scanner;

public class strToIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the input string
        String input = sc.nextLine();
        // Split the string by spaces to get individual number strings
        String[] IntArr = input.trim().split("\\s+");
        
        int[] numbers = new int[IntArr.length];
        
        for (int i = 0; i < IntArr.length; i++) {
            numbers[i] = Integer.parseInt(IntArr[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
