import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = obj.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter position of element to delete:");
        int pos = obj.nextInt();

        // Validate position
        if (pos < 1 || pos > n) {
            System.out.println("Invalid position! Please enter a position between 1 and " + n);
        } else {
            // Shift elements to the left
            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Reduce array size

            // Print the updated array
            System.out.println("Updated array:");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }

        obj.close();
    }
}
