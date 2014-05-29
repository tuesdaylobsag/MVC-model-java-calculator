/**
 * An interface that allow us to communicate with the view and the model through
 * the controller.
 */
package view;
/**
 * @author Ricardo Saumeth
 * @version 29/05/2014
 */
public interface OperationsListener {
    /**
     * An abstract method used to run the arithmetics operations.
     * @param evt 
     */
    public void makeOperations(NumbersFormEvent evt);
}
