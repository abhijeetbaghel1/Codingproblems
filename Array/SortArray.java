import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort in ascending order
        System.out.println("Array sorted in ascending order:");
        int[] ascendingArr = sortAscending(arr.clone());
        for (int num : ascendingArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort in descending order
        System.out.println("Array sorted in descending order:");
        int[] descendingArr = sortDescending(arr.clone());
        for (int num : descendingArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    // Method to sort the array in ascending order
    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Method to sort the array in descending order
    public static int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
