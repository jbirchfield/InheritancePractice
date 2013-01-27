package myinterface;

/**
 * @author james birchfield
 */
public class HourlyEmployee implements Employee{
    private int hoursWorked;                    //number of hours worked
    private double hourlyRate;                  //dollars per hour paid
    private double hourlySalary;                //amount earned this pay period
    private int empNumber;
    private String empDept;
    private String empFName;
    private String empLName;
    
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
    public double calcHourlySalary(double rate,int hours)
    {
        return hourlySalary = rate * hours;
    }
    
    public int getEmpNumber() {
        return empNumber;
    }
    
    public String getEmpDept() {
        return empDept;
    }
    
    public String getEmpFName() {
        return empFName;
    }
    
    public String getEmpLName() {
        return empLName;
    }
    
}
