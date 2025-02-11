import java.util.Scanner;

public class PerfectNumbers {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void printPerfectNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter end of the interval: ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        printPerfectNumbersInRange(start, end);
    }
}
