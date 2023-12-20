public class Main {

    public static void main(String[] args) {

        int number = 5;
        long factorialResult = calculateFactorial(number);
        System.out.println("Факторіал " + number + " = " + factorialResult);
    }


    public static long calculateFactorial(int n) {
        // Базовий випадок: факторіал 0 та 1 дорівнює 1
        if (n == 0 || n == 1) {
            return 1;
        } else {

            return n * calculateFactorial(n - 1);
        }
    }
}
