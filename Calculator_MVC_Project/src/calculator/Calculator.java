/**
 * The main method is here. 
 */
package calculator;

import controller.Controller;
import model.Model;
import view.CalculatorGUI;

/**
 * @author Ricardo Saumeth
 * @version 29/05/2014
 */
public class Calculator {
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               runApp(); 
            }
        });
    }
    /**
     * We create objects of the classes.
     */
    private static void runApp(){
        
        CalculatorGUI view = new CalculatorGUI();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        
        view.addOperationListener(controller);
    }
}
