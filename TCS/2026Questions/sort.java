import java.util.*;

public class sort {

    static boolean isSmaller(int[] a, int[] b) {
        if (a[0] != b[0])
            return a[0] < b[0];
        return a[1] < b[1];
    }

    static void customSort(List<int[]> v) {
        int n = v.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (isSmaller(v.get(j), v.get(minIndex))) {
                    minIndex = j;
                }
            }
            int[] temp = v.get(i);
            v.set(i, v.get(minIndex));
            v.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String line = sc.nextLine();
        List<int[]> v = new ArrayList<>();

        String[] pairs = line.split(",");

        for (String p : pairs) {
            String[] nums = p.trim().split("\\s+"); //for multiple spaces
            //first trim extra space before the element and then split by space 
            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            v.add(new int[]{x, y});
        }

        customSort(v);

        for (int i = 0; i < n; i++) {
            System.out.print(v.get(i)[0] + " " + v.get(i)[1]);
            if (i != n - 1) System.out.print(",");
        }
        sc.close();
    }
}