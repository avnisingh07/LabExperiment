import java.io.*;

public class Factorial{

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(System.in);
        Console console = System.console();
        int choice;

        do {
            System.out.println("Select Input Method:");
            System.out.println("1. Command Line Arguments");
            System.out.println("2. Scanner");
            System.out.println("3. BufferedReader");
            System.out.println("4. DataInputStream");
            System.out.println("5. Console");
            System.out.println("6. Exit");

            try {
                choice = Integer.parseInt(br.readLine());
            } catch (IOException | NumberFormatException e) {
                choice = 0;
            }
            switch (choice) {
                case 1:
                    commandLineArgsFactorial(args);
                    break;
                case 2:
                    scannerFactorial();
                    break;
                case 3:
                    bufferedReaderFactorial(br);
                    break;
                case 4:
                    dataInputStreamFactorial(dis);
                    break;
                case 5:
                    consoleFactorial(console);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);
    }

    private static void commandLineArgsFactorial(String[] args) {
        System.out.println("Input Method: Command Line Arguments");
        if (args.length != 1) {
            System.out.println("Usage: java FactorialDemo <number>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + ": " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    private static void scannerFactorial() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Method: Scanner");
        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(br.readLine());
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + ": " + factorial);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReaderFactorial(BufferedReader br) {
        System.out.println("Input Method: BufferedReader");
        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(br.readLine());
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + ": " + factorial);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void dataInputStreamFactorial(DataInputStream dis) {
        System.out.println("Input Method: DataInputStream");
        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(dis.readLine());
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + ": " + factorial);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void consoleFactorial(Console console) {
        System.out.println("Input Method: Console");
        if (console != null) {
            String input = console.readLine("Enter a number: ");
            try {
                int n = Integer.parseInt(input);
                long factorial = calculateFactorial(n);
                System.out.println("Factorial of " + n + ": " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } else {
            System.out.println("Console is not available.");
        }
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
