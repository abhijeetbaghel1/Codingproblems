import java.util.Scanner;

public class LeftrotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number of positions to rotate
        System.out.print("Enter the number of positions to rotate: ");
        int d = scanner.nextInt();

        // Ensure the number of rotations is within array length
        d = d % n;

        // Call the function to rotate the array
        leftRotate(array, d);

        // Output the rotated array
        System.out.println("Array after left rotation:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Function to left rotate the array
    public static void leftRotate(int[] array, int d) {
        int n = array.length;

        // Create a temporary array to store the first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = array[i];
        }

        // Shift the remaining elements to the left
        for (int i = 0; i < n - d; i++) {
            array[i] = array[i + d];
        }

        // Copy the temporary array elements back to the end
        for (int i = 0; i < d; i++) {
            array[n - d + i] = temp[i];
        }
    }
}
