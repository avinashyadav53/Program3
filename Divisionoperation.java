package student;

public class Divisionoperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
