import java.util.Scanner;

public class StrongNumbers {
    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static boolean isStrong(int num) {
        int sum = 0, originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void printStrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
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

        System.out.println("Strong numbers between " + start + " and " + end + ":");
        printStrongNumbersInRange(start, end);
    }
}
