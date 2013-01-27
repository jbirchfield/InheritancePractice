package myconcrete;
/**
 * @author james birchfield
 */
public class Employee {

    private String empFName;                //employee's first name
    private String empLName;                //employee's last name
    private int empNumber;                  //employee's ID number
    private String empDept;                 //department employee works in

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
    
    
}
