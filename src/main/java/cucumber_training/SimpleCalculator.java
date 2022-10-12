package cucumber_training;

public class SimpleCalculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    public int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            return a / b;
        }
    }
}
