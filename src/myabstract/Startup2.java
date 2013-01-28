package myabstract;

/**
 * @author james birchfield
 */
public class Startup2 {
    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
    
        SalaryPlusBonusEmployee emp1 = new SalaryPlusBonusEmployee("Elwood","Dodd");
        
        emp1.setEmpDept("Fantasy");
        emp1.setEmpNumber(4444);
        emp1.setWklySalary(3241.65);
        emp1.setBonusAmount(2345.43);
        
        System.out.println(emp1.getEmpFName() + "  " +
                           emp1.getEmpLName() + "  " +
                           emp1.getEmpDept() + "  " +
                           emp1.getEmpNumber() + "  " +
                           emp1.getWklySalary() + "  " +
                           emp1.getBonusAmount());
        
        
    }
    
    
}
