import java.util.Scanner;
public class Calculator {
    public Calculator() {

    }

    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    public int difference(int value1, int value2) {
        return value1 - value2;
    }

    public void function() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a function");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        int function = scan.nextInt();
        switch (function) {
            case 1 -> {
                System.out.print("Enter value one: ");
                int value1 = scan.nextInt();
                System.out.print("Enter value two: ");
                int value2 = scan.nextInt();
                System.out.println("Total: " + this.sum(value1, value2));
            }
            case 2 -> {
                System.out.print("Enter value one: ");
                int a = scan.nextInt();
                System.out.print("Enter value two: ");
                int b = scan.nextInt();
                System.out.println("Difference: " + this.difference(a, b));
            }
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        calculator.function();
        boolean over = false;
        while (!over) {
            System.out.println("Input another? y/n:");
            String question = scan.next();
            if (question.equalsIgnoreCase("y")) {
                calculator.function();
            } else {
                over = true;
                break;
            }
        }
        scan.close();
    }

}
