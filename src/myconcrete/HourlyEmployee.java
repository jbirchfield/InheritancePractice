package myconcrete;

/**
 * @author james birchfield
 */
public class HourlyEmployee extends Employee 
{
    private int hoursWorked;                    //number of hours worked
    private double hourlyRate;                  //dollars per hour paid
    private double totalSalary;                 //amount earned this pay period
    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    //Calculate the salary earned
    public double calcTotalSalary(double rate,int hours)
    {
        return totalSalary = rate * hours;
    }
}
