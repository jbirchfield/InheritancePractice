package myinterface;

/**
 
 * @author james birchfield
 */
public class SalariedEmployee implements Employee{
    private double wklySalary;              //salary for the week
    private int empNumber;
    private String empDept;
    private String empFName;
    private String empLName;
    

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
    public String getEmpFName() {
        return empFName;
    }
    public String getEmpLName() {
        return empLName;
    }
    
}
