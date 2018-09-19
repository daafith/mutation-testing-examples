package app;

public class UnsophisticatedCalculator {

    /**
     * Assumes that -0.0 is equal to 0.0, which is mathematically true
     * @param realNumber
     * @return
     */
    public static double squareRoot(double realNumber) {
        if (realNumber < 0) {
            throw new RuntimeException("I only deal with positive numbers");
        }
        return Math.sqrt(realNumber);
    }

}
