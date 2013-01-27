package myconcrete;

/**
  * @author james birchfield
 */
public class SalariedEmployee extends Employee{
    private double wklySalary;              //salary for the week

    public double getWklySalary() {
        return wklySalary;
    }

    public void setWklySalary(double wklySalary) {
        this.wklySalary = wklySalary;
    }
    
    
    
}
