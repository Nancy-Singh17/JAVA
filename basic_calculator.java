import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        double number1, number2, result;
        char operator;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        if (operator == '+') {
            result = number1 + number2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("NOT DEFINED");
            }
        } else {
            System.out.println("INVALID OPERATOR!");
        }
        input.close();
    }
}
