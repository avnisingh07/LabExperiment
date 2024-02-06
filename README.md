Experiment 1 part 1
FACTORIAL:
This Java program calculates the factorial of a given number using various input methods. 
Input Methods
The program supports the following input methods:

1. Command Line Arguments: Provide the number as a command line argument.
2. Scanner: Accept user input using the `Scanner` class.
3. BufferedReader: Accept user input using the `BufferedReader` class.
4. DataInputStream: Accept user input using the `DataInputStream` class.
5. Console: Accept user input using the `Console` class.
Methods:
1.main(String[] args):The main method initializes input streams and presents a menu to select the input method. It then calls respective methods based on user choice until the user chooses to exit.
2.commandLineArgsFactorial(String[] args) - Calculates the factorial using command line arguments. Validates the input and handles exceptions.
3.scannerFactorial()-Calculates the factorial using `Scanner` class for input,Handles user input and exceptions using `BufferedReader`.
4.bufferedReaderFactorial(BufferedReader br)-Calculates the factorial using `BufferedReader` for input.Handles user input and exceptions.
5.dataInputStreamFactorial(DataInputStream dis)-Calculates the factorial using `DataInputStream` for input.Handles user input and exceptions.
6.consoleFactorial(Console console)-Calculates the factorial using `Console` for input. Handles user input and exceptions.
7.calculateFactorial(int n)-Calculates the factorial of a given integer `n`.
Throws an `IllegalArgumentException` for negative numbers. Returns the factorial value as a `long`.

Experiment 1 part 2
CALCULATOR:
This Java class provides various mathematical operations such as addition, subtraction, multiplication, division, square root, power, mean, and variance calculation.
Methods:
add(double num1, double num2)- Adds two numbers and returns the result.
subtract(double num1, double num2)- Subtracts the second number from the first and returns the result.
multiply(double num1, double num2)- Multiplies two numbers and returns the result.
divide(double num1, double num2)- Divides the first number by the second number and returns the result.Throws an `IllegalArgumentException` if the second number is zero.
squareRoot(double num)- Calculates the square root of a number and returns the result.Throws an `IllegalArgumentException` if the input number is negative.
power(double base, double exponent)- Raises the base to the power of the exponent and returns the result.
mean()- Calculates the mean (average) of a set of numbers entered by the user. Prompts the user to enter numbers until they type 'end'. Throws an `IllegalArgumentException` if no numbers are entered.
variance()- Calculates the variance of a set of numbers entered by the user.Prompts the user to enter numbers until they type 'end'.Throws an `IllegalArgumentException` if no numbers are entered.

