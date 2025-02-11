import java.util.Scanner;

public class CountFrequency {
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

        System.out.println("Element Frequencies:");  //
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue; // Skip already counted elements
            }

            int count = 1; // Count the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1; // Mark as visited
                }
            }

            // Print frequency of the current element
            System.out.println(arr[i] + ": " + count + " times");
        }

        scanner.close();
    }
}
