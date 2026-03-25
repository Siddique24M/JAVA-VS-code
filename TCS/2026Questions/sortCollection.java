import java.util.*;

public class sortCollection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String line = sc.nextLine();
        List<int[]> v = new ArrayList<>();

        String[] pairs = line.split(",");

        for (String p : pairs) {
            String[] nums = p.trim().split("\\s+"); // handles multiple spaces
            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            v.add(new int[]{x, y});
        }

        // 🔹 Simple sorting using Collections.sort
        Collections.sort(v, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];   // sort by first element
            return a[1] - b[1];       // if equal, sort by second
        });

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(v.get(i)[0] + " " + v.get(i)[1]);
            if (i != n - 1) System.out.print(",");
        }

        sc.close();
    }
}