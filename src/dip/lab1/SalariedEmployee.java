package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
    
    
    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {}
    private double annualSalary;
    private double annualBonus;
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    @Override
    public

    
}
