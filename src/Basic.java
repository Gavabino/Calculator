import java.util.Scanner;
public class Basic extends Calculator{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        calculator.functionBasic();
        boolean over = false;
        while (!over) {
            System.out.println("Input another? y/n:");
            String question = scan.next();
            if (question.equalsIgnoreCase("y")) {
                calculator.functionBasic();
            } else {
                over = true;
                break;
            }
        }
        scan.close();
    }
}
