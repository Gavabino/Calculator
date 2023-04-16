public class Calculator {

    public Calculator() {

    }
    public int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(new int[]{1, 2, 3}));
    }
}
