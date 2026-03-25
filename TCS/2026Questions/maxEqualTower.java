import java.util.*;
public class maxEqualTower {
    public static int maxHeight(int[] nums) {
        // dp[diff] = max height of the shorter tower
        // diff = tallerTowerHeight - shorterTowerHeight
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);

        for (int num : nums) {
            Map<Integer, Integer> nextDp = new HashMap<>(dp);
            for (Map.Entry<Integer, Integer> entry : dp.entrySet()) {
                int diff = entry.getKey();
                int lower = entry.getValue();

                // Option 1: Add to the taller tower
                int diff1 = diff + num;
                nextDp.put(diff1, Math.max(nextDp.getOrDefault(diff1, 0), lower));

                // Option 2: Add to the shorter tower
                if (num <= diff) {
                    // Still the shorter tower or they become equal
                    int diff2 = diff - num;
                    nextDp.put(diff2, Math.max(nextDp.getOrDefault(diff2, 0), lower + num));
                } else {
                    // Shorter tower becomes the taller tower
                    int diff2 = num - diff;
                    nextDp.put(diff2, Math.max(nextDp.getOrDefault(diff2, 0), lower + diff));
                }
            }
            dp = nextDp;
        }

        // Return height where difference is 0
        return dp.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6};
        System.out.println("Max Equal Height: " + maxHeight(arr)); // Output: 6
    }
}

