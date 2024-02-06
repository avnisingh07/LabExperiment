import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                double result;
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        double addNum1 = scanner.nextDouble();
                        double addNum2 = scanner.nextDouble();
                        result = Calculator.add(addNum1, addNum2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        double subNum1 = scanner.nextDouble();
                        double subNum2 = scanner.nextDouble();
                        result = Calculator.subtract(subNum1, subNum2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        double mulNum1 = scanner.nextDouble();
                        double mulNum2 = scanner.nextDouble();
                        result = Calculator.multiply(mulNum1, mulNum2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        double divNum1 = scanner.nextDouble();
                        double divNum2 = scanner.nextDouble();
                        result = Calculator.divide(divNum1, divNum2);
                        System.out.println("Result: " + result);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        double sqrtNum = scanner.nextDouble();
                        result = Calculator.squareRoot(sqrtNum);
                        System.out.println("Result: " + result);
                        break;
                    case 6:
                        System.out.print("Enter base and exponent: ");
                        double base = scanner.nextDouble();
                        double exponent = scanner.nextDouble();
                        result = Calculator.power(base, exponent);
                        System.out.println("Result: " + result);
                        break;
                    case 7:
                        result = Calculator.mean();
                        System.out.println("Mean: " + result);
                        break;
                    case 8:
                        result = Calculator.variance();
                        System.out.println("Variance: " + result);
                        break;
                    case 9:
                        System.out.println("Exiting program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input
            }

        }

    }
}


