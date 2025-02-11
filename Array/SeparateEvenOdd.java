import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Temporary arrays to store even and odd elements
        int[] evenArr = new int[n];
        int[] oddArr = new int[n];
        int evenIndex = 0, oddIndex = 0;

        // Separate even and odd elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }

        // Print the even elements
        System.out.println("Even elements:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

        // Print the odd elements
        System.out.println("Odd elements:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }

        scanner.close();
    }
}
