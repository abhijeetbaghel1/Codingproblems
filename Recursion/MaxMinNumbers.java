import java.util.Scanner;

public class MaxMinNumbers {
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int findMin(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Maximum: " + findMax(num1, num2));
        System.out.println("Minimum: " + findMin(num1, num2));
    }
}
