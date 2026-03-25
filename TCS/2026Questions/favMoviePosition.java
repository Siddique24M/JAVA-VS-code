import java.util.Arrays;
import java.util.Scanner;
public class favMoviePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array (N)
        if (!sc.hasNextInt()) 
            return;
        int n = sc.nextInt();

        // Initialize the array to store movie IDs
        int[] movieIds = new int[n];
        for (int i = 0; i < n; i++) {
            movieIds[i] = sc.nextInt();
        }

        // Read the favorite movie's 1-based original position (K)
        int k = sc.nextInt();

        // 1. Identify the favorite movie ID using the 1-based index
        // We use k-1 because Java arrays are 0-indexed
        int favoriteMovieId = movieIds[k - 1];

        // 2. Sort the array in ascending order
        Arrays.sort(movieIds);

        // 3. Find the new 1-based position of the favorite movie
        int newPosition = -1;
        for (int i = 0; i < n; i++) {
            if (movieIds[i] == favoriteMovieId) {
                // Return 1-based index (i + 1)
                newPosition = i + 1;
                break; 
            }
        }

        // Output the result
        System.out.println(newPosition);
        
        sc.close();
    }
}

