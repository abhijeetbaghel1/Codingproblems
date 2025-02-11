import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] visited = new int[n]; // Array to mark visited elements

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            visited[i] = 0; // Initialize visited array with 0
        }

        // Create a new array to hold unique elements
        int[] uniqueArray = new int[n];
        int uniqueIndex = 0; // Index for the unique array

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue; // Skip already processed elements
            }

            boolean isDuplicate = false;

            // Mark duplicates and skip them
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = 1; // Mark as visited
                    isDuplicate = true;
                }
            }

            // Add to unique array only if it's not a duplicate
            if (!isDuplicate) {
                uniqueArray[uniqueIndex++] = arr[i];
            }
        }

        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(uniqueArray[i] + " ");
        }

        scanner.close();
    }
}
