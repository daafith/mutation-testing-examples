package app;

public class UnsophisticatedCalculator {

    public static double squareRoot(double realNumber) {
        if (isNegative(realNumber)) {
            throw new RuntimeException("I only deal with positive numbers");
        }
        return Math.sqrt(realNumber);
    }

    private static boolean isNegative(double realNumber) {
        return Double.compare(realNumber, 0.0) < 0;
    }


}
