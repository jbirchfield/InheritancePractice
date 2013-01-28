package myabstract;

/**
 * @author jamesb
 */
public abstract class Employee {
    String empFName;                //employee's first name
    String empLName;                //employee's last name
        
    //The constructor accepts as arguments the employee first and last name
    public Employee(String fnam, String lnam)
    {
        empFName = fnam;
        empLName = lnam;
    }
    
    public abstract int getEmpNumber();
    public abstract String getEmpDept(); 
    
    
    
}
