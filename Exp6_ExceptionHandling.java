public class Exp6_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("Try-Catch completed");
        }
    }
}
