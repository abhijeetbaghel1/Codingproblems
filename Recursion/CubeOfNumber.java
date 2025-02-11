import java.util.Scanner;

public class CubeOfNumber {
    public static int findCube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Cube of " + num + " is: " + findCube(num));
    }
}
