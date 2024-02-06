import java.util.Scanner;

public class Calculator{
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root of negative number is undefined");
        }
        return Math.sqrt(num);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double mean() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count++;
        }

        scanner.close();

        if (count == 0) {
            throw new IllegalArgumentException("No numbers entered");
        }

        return sum / count;
    }

    public static double variance() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double squaredSum = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");
        while (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            sum += num;
            squaredSum += num * num;
            count++;
        }

        scanner.close();

        if (count == 0) {
            throw new IllegalArgumentException("No numbers entered");
        }

        double mean = sum / count;
        double meanOfSquares = squaredSum / count;

        return meanOfSquares - (mean * mean);
    }
}
