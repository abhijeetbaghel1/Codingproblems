import java.util.Scanner;

public class CircleCalculations {
    public static double getDiameter(double radius) {
        return 2 * radius;
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.println("Diameter: " + getDiameter(radius));
        System.out.println("Circumference: " + getCircumference(radius));
        System.out.println("Area: " + getArea(radius));
    }
}
