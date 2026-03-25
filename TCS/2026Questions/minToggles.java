public class minToggles {
    
    public static int minOperations(int[] nums) {
        int count = 0;

        for (int num : nums) {
            // If count is even, the element is in its original state.
            // If count is odd, the element is currently flipped (0 becomes 1, 1 becomes 0).
            int currentState = (count % 2 == 0) ? num : (num == 1 ? 0 : 1);

            // If the current state is 0, we must toggle.
            if (currentState == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0}; 
        System.out.println("Minimum operations: " + minOperations(arr));
    }
}

