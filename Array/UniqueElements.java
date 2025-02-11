import java.util.Scanner;

public class UniqueElements {
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

        System.out.println("Unique Elements:");
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue; // Skip already counted elements
            }

            int count = 1; // Count occurrences of the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1; // Mark duplicate as visited
                }
            }

            // If the count is 1, the element is unique
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

        scanner.close();
    }
}
