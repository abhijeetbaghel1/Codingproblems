import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.println("Enter size of the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.println("Enter element to search:");
        int toSearch = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        int position = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == toSearch) {
                found = true;
                position = i + 1; // Position is 1-based
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println(toSearch + " is found at position " + position);
        } else {
            System.out.println(toSearch + " is not found in the array");
        }

        scanner.close();
    }
}
