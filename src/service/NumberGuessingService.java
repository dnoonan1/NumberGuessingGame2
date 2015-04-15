package service;

import java.util.Random;

/**
 *
 * @author dnoonan1
 */
public class NumberGuessingService {

    private int minValue;
    private int maxValue;
    private int value;
    private Random random;
    
    public static final int DEFAULT_MIN_VALUE = 1;
    public static final int DEFAULT_MAX_VALUE = 10;

    public NumberGuessingService() {
        this(DEFAULT_MIN_VALUE, DEFAULT_MAX_VALUE);
    }
    
    public NumberGuessingService(int minValue, int maxValue) {
        if (minValue < maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
        this.random = new Random();
        newRandomNumber();
    }

    public int getMinValue() {
        return minValue;
    }
    
    public final void setMinValue(int minValue) {
        if (minValue > maxValue) {
            throw new IllegalArgumentException();
        }
        this.minValue = minValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }

    public final void setMaxValue(int maxValue) {
        if (maxValue < minValue) {
            throw new IllegalArgumentException();
        }
        this.maxValue = maxValue;
    }
    
    public final void setRange(int minValue, int maxValue) {
        if (minValue > maxValue) {
            throw new IllegalArgumentException();
        }
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    
    public final void newRandomNumber() {
        value = minValue + random.nextInt(maxValue - minValue + 1);
    }
    
    public final int checkGuess(int guess) throws OutOfRangeException {
        if (guess < minValue || guess > maxValue) {
            throw new OutOfRangeException(
                String.format("Guess %d is outside of range [%d, %d].",
                    guess, minValue, maxValue)
            );
        }
        return guess - value;
    }
    
}
