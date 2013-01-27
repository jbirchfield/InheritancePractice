package myconcrete;

/**
 * @author james birchfield
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonusAmount;             //bonus earned

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    
    
    
}
