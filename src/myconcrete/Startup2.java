package myconcrete;

/**
  * @author james birchfield
 */
public class Startup2 {
    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
        // a SalaryPlusBonusEmpoyee inherits methods and fields from Employee
        // and SalariedEmployee 
        SalaryPlusBonusEmployee emp1 = new SalaryPlusBonusEmployee();
        emp1.setEmpFName("John");
        emp1.setEmpLName("Smith");
        emp1.setEmpDept("Warehouse");
        emp1.setEmpNumber(1111);
        emp1.setWklySalary(2114.54);
        emp1.setBonusAmount(350.00);
        
        System.out.println(emp1.getEmpFName() + "  "
                         + emp1.getEmpLName() + "  "
                         + emp1.getEmpDept()  + "  "
                         + emp1.getEmpNumber() + "  "
                         + emp1.getWklySalary() + "  "
                         + emp1.getBonusAmount());
    }
    
}
