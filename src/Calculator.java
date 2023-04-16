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
    public int quotient(int value1, int value2) {
        return value1 / value2;
    }
    public int product(int value1, int value2) {
        return value1 * value2;
    }
    public void functionBasic() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a function");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("3. Multiply");
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
            case 3 -> {
                System.out.print("Enter value one: ");
                int c = scan.nextInt();
                System.out.print("Enter value two: ");
                int d = scan.nextInt();
                System.out.println("Quotient: " + this.quotient(c, d));
            }
            case 4 -> {
                System.out.print("Enter value one: ");
                int e = scan.nextInt();
                System.out.print("Enter value two: ");
                int f = scan.nextInt();
                System.out.println("Total: " + this.product(e, f));
            }
        }
    }
}
