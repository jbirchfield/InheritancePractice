package myabstract;

/**
 * @author james irchfieldb
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonusAmount;             //bonus earned
    
    //The constructor accepts as arguments the employee first and last name
    public SalaryPlusBonusEmployee(String fnam, String lnam)
    {
        super(fnam, lnam);
    }
    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    
}
