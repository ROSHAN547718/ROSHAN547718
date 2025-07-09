/**
 * MathUtils - A utility class for common math operations.
 * 
 * Includes methods like:
 * - Checking if a number is even
 * - Calculating factorial
 * - Calculating power
 * 
 * Author: Roshan
 * Date: Day 15 – Java Functions Practice
 */
public class MathUtils {

    // -------------------------------
    // 📦 Number Operations
    // -------------------------------

    /**
     * Checks if a number is even.
     * @param n the number to check
     * @return true if even, false if odd
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Calculates factorial of a number (n!).
     * @param n the number
     * @return factorial of n
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates a to the power of b (a^b).
     * @param a the base
     * @param b the exponent
     * @return a raised to the power b
     */
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    // -------------------------------
    // 🛠️ Utility Functions
    // -------------------------------

    /**
     * Returns the greater of two numbers.
     * @param a first number
     * @param b second number
     * @return the greater number
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Checks if a number is positive.
     * @param n the number
     * @return true if positive, false otherwise
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    // You can add more utility functions here later!
}
