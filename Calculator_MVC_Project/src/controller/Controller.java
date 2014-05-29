/**
 * This class is in charge of the communication between the model and the view.
 */
package controller;


import model.Model;
import view.CalculatorGUI;
import view.Click;
import view.NumbersFormEvent;
import view.OperationsListener;


/**
 * @author Ricardo Saumeth
 * @version 29/05/2014
 */
public class Controller implements OperationsListener{

    private Model model;
    private CalculatorGUI view;

    /**
     * Instantiate objects of the class Controller and Model
     * @param model
     * @param view 
     */
    public Controller(Model model, CalculatorGUI view) {
        this.model = model;
        this.view = view;
    }
    /**
     * Overrides the method of the interface OperationsListener.
     * Receives the numbers input by the user. 
     * Determines which arithmetic operation should be done.
     * @param evt 
     */
    @Override
    public void makeOperations(NumbersFormEvent evt) {
        double x = 0, y = 0;
        
            x = evt.getFirstNumber();
            y = evt.getSecondNumber();
            Click c = evt.getOperation();
            
            if(c == Click.addition)
               view.display(Double.toString(model.setSum(x, y)));
            else if(c == Click.subtraction)
               view.display(Double.toString(model.setSubtraction(x, y))); 
            else if(c == Click.multiplication)
                view.display(Double.toString(model.setMultiplication(x, y)));
            else if(c == Click.division)
                view.display(Double.toString(model.setDivision(x, y)));
        }
    }

    

    
    
    


    

    
    
    
    

