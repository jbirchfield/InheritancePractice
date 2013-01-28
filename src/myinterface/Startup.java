package myinterface;

/**
 * @author jamesb
 */
public class Startup {
    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
    
        SalariedEmployee emp1 = new SalariedEmployee();
        
        emp1.setEmpFName("Sam");
        emp1.setEmpLName("Sullivan");
        emp1.setEmpDept("Sales");
        emp1.setEmpNumber(2222);
        emp1.setWklySalary(1250.00);
        
        System.out.println(emp1.getEmpFName() + "  " +
                           emp1.getEmpLName() + "  " +
                           emp1.getEmpDept() + "  " +
                           emp1.getEmpNumber() + "  " +
                           emp1.getWklySalary());
        
        
    }
    
    
}
