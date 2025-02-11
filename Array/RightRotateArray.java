import java.util.Scanner;

public class RightRotateArray {
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

        // Normalize the rotations
        d = d % n;

        // Call the function to right rotate the array
        rightRotate(array, d);

        // Output the rotated array
        System.out.println("Array after right rotation:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Function to right rotate the array
    public static void rightRotate(int[] array, int d) {
        int n = array.length;

        // Create a temporary array to store the last d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = array[n - d + i];
        }

        // Shift the remaining elements to the right
        for (int i = n - 1; i >= d; i--) {
            array[i] = array[i - d];
        }

        // Copy the temporary array elements to the beginning
        for (int i = 0; i < d; i++) {
            array[i] = temp[i];
        }
    }
}
