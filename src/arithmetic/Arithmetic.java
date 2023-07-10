package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Operation operation = getOperationFromUser();
        double result = r.calculate(m, n, operation);

        System.out.println("result: " + result);
    }

    private static Operation getOperationFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = sc.next().toUpperCase();

        try {
            return Operation.valueOf(input);
        } catch (IllegalArgumentException e) {
            throw new AssertionError("Unknown operation: " + input);
        }
    }
}

