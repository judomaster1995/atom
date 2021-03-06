package ru.atom;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        if (values.length == 0) {
            throw new UnsupportedOperationException();
        } else {
            int rez = values[0];
            for (int i = 1; i < values.length; ++i) {
                if (rez < values[i]) {
                    rez = values[i];
                }
            }
            return rez;
        }
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        if (values.length == 0) {
            throw new UnsupportedOperationException();
        } else {
            long sum = 0;
            for (int i = 0; i < values.length; ++i) {
                sum += values[i];
            }
            return sum;
        }
    }
}
