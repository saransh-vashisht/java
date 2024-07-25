import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Initialize Scanner to read input
        double a = scanner.nextDouble();  // Read coefficient a
        double b = scanner.nextDouble();  // Read coefficient b
        double c = scanner.nextDouble();  // Read coefficient c
        double d = b * b - 4 * a * c;  // Calculate the discriminant
        double x1, x2;

        if (d > 0) {
            // Two real and distinct roots
            x1 = (-b + Math.sqrt(d)) / (2 * a);  // First root
            x2 = (-b - Math.sqrt(d)) / (2 * a);  // Second root
            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            // Two real and equal roots
            // d is equal to 0
            // so -b + 0 == -b
            x1 = x2 = -b / (2 * a);
            System.out.printf("x1 = x2 = %.2f;%n", x1);
            System.out.println("x1 = x2 = " + x1);
        } else {
            // Roots are complex numbers and distinct
            double real = -b / (2 * a);  // Real part
            double imaginary = Math.sqrt(-d) / (2 * a);  // Imaginary part
            System.out.format("x1 = %.2f + %.2fi%n", real, imaginary);
            System.out.format("x2 = %.2f - %.2fi%n", real, imaginary);
        }
        scanner.close();  // Close the Scanner to prevent resource leak
    }
}


