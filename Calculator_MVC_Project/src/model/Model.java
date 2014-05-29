/**
 * A class with the arithmetic operations
 */
package model;

/**
 * @author Ricardo Saumeth
 * @version 29/05/2014
 */
public class Model {
    
    /**
     * Return the sum of x and y.
     * @param x. First Number 
     * @param y. Second Number
     * @return Return the sum of x and y.
     */
    public double setSum(double x, double y){
        return x + y;
    }
    /**
     * Return the subtraction between x and y
     * @param x First Number
     * @param y Second Number
     * @return Return the subtraction between x and y
     */
    public double setSubtraction(double x, double y){
        return x - y;
    }
    /**
     * Return the multiplication between x and y.
     * @param x First Number
     * @param y Second Number
     * @return Return the multiplication between x and y.
     */
    public double setMultiplication(double x, double y){
        return x * y;
    }
    /**
     * Return the division between x and y.
     * @param x First Number
     * @param y Second Number
     * @return Return the division between x and y.
     */
    public double setDivision(double x, double y){
        return x / y;
    }
}
