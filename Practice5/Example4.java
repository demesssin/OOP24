package Practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] expressions = input.split(" ");

        for (String expr : expressions) {
            processExpression(expr);
        }
    }

    private static void processExpression(String expr) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);


        try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();
            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                System.out.println("The left operand is not a number: " + leftString);
                return;
            }

            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                System.out.println("The right operand is not a number: " + rightString);
                return;
            }

            switch (operator) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    if (rightOperand != 0) {
                        result = leftOperand / rightOperand;
                    } else {
                        System.out.println("Cannot divide by zero in expression: " + expr);
                        return;
                    }
                    break;
                default:
                    System.out.println("Unsupported operator in expression: " + expr);
                    return;
            }

            System.out.println("Result of '" + expr + "' is: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression: " + expr);
        }
    }
}
