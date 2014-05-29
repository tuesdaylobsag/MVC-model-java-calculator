/**
 * A bin class that stores the numbers input by the user.
 */
 package view;

/**
 * @author Ricardo Saumeth
 * @version 29/05/2014
 */
public class NumbersFormEvent {
    //varibles to store the numbers
    private double firstNumber;
    private double secondNumber;
    private Click operation;
    /**
     * Instantiate objects to store the numbers
     * @param firstNumber
     * @param secondNumber
     * @param operation 
     */
    public NumbersFormEvent(double firstNumber, double secondNumber, Click operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }
    /**
     * Return the first number stored
     * @return Return the first number stored
     */
    public double getFirstNumber() {
        return firstNumber;
    }
    /**
     * Return the second number stored
     * @return Return the second number stored
     */
    public double getSecondNumber() {
        return secondNumber;
    }
    /**
     * Return the arithmetic operation defined by the user
     * @return Return the arithmetic operation defined by the user
     */
    public Click getOperation() {
        return operation;
    }
}
