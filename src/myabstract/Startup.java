package myabstract;

/**
 * @author james birchfield
 */
public class Startup {
    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
    
        SalariedEmployee emp1 = new SalariedEmployee("Harvey","Wallbanger");
        
        emp1.setEmpDept("Liquor");
        emp1.setEmpNumber(3333);
        emp1.setWklySalary(1250.00);
        
        System.out.println(emp1.getEmpFName() + "  " +
                           emp1.getEmpLName() + "  " +
                           emp1.getEmpDept() + "  " +
                           emp1.getEmpNumber() + "  " +
                           emp1.getWklySalary());
        
        
    }
    
}
