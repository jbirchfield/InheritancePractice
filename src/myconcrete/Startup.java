package myconcrete;
/**
 * @author james birchfield
 */
public class Startup {
    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
        //Salaried Employee inherits methods and fields from Employee
        SalariedEmployee emp1 = new SalariedEmployee();
        emp1.setEmpFName("John");
        emp1.setEmpLName("Smith");
        emp1.setEmpDept("Warehouse");
        emp1.setEmpNumber(1111);
        
        System.out.println(emp1.getEmpFName() + "  "
                         + emp1.getEmpLName() + "  "
                         + emp1.getEmpDept()  + "  "
                         + emp1.getEmpNumber() + "  ");
    }
}