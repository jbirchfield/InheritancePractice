package myabstract;

/**
 * @author james birchfield
 */
public class SalariedEmployee extends Employee {
    private double wklySalary;              //salary for the week
    private int empNumber;
    private String empDept;
    
    //The constructor accepts as arguments the employee first and last name
    public SalariedEmployee(String fnam, String lnam)
    {
        super(fnam, lnam);
    }
    public double getWklySalary() {
        return wklySalary;
    }

    public void setWklySalary(double wklySalary) {
        this.wklySalary = wklySalary;
    }
    
    public int getEmpNumber() {
        return empNumber;
    }
    public String getEmpDept() {
        return empDept;
    }
    
}
