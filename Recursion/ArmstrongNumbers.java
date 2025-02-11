import java.util.Scanner;

public class ArmstrongNumbers {
    public static boolean isArmstrong(int num) {
        int sum = 0, originalNum = num;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void printArmstrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
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

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        printArmstrongNumbersInRange(start, end);
    }
}
