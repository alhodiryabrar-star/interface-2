
package abrar;

import java.time.LocalDate;

public class ContractorEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public ContractorEmployee(String id, String name, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        
        super(id, name, 0.0, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateNetSalary() {
        
        double grossSalary = hourlyRate * hoursWorked;
        return grossSalary - calculateTax();
    }
    
    @Override
    public double calculateBonus(double performanceScore) {
       
        if (performanceScore > 4.0) {
            return 500.0;
        }
        return 0.0;
    }
}
