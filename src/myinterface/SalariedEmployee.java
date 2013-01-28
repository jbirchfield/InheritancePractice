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
    
    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }
    
    public String getEmpDept() {
        return empDept;
    }
    
    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }
    
    public String getEmpFName() {
        return empFName;
    }
    
    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

    public String getEmpLName() {
        return empLName;
    }
    
    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }

    
}
