package abrar;

    import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PayrollSystem {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new FullTimeEmployee("E001", "Abrar", 1200.0, LocalDate.of(2023, 5, 10), 300.0));
        employees.add(new ContractorEmployee("E002", "Muhanad", LocalDate.of(2024, 1, 15), 25, 160));
        employees.add(new FullTimeEmployee("E003", "Sara", 950.0, LocalDate.of(2022, 11, 1), 200.0));

        System.out.println("=== Original Employee List ===");
        for (Employee e : employees) {
            System.out.println(e.getName() + " | Net Salary: " + e.calculateNetSalary());
        }

        
      Collections.sort(employees);
        System.out.println("\n=== Sorted by Net Salary (Descending) ===");
        for (Employee e : employees) {
            System.out.println(e.getName() + " | Net Salary: "  + e.calculateNetSalary());
        }
        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\n=== Sorted by Join Date (Oldest First) ===");
        for (Employee e : employees) {
            System.out.println(e.getName() + " | Join Date: " + e.getJoinDate());
        }

       
        double totalNetSalaries = 0;
        double totalBonus = 0;
        for (Employee e : employees) {
            totalNetSalaries += e.calculateNetSalary();
            totalBonus += e.calculateBonus(4.5);
        }

        System.out.println("\n=== Financial Summary ===");
        System.out.println("Total Net Salaries: " + totalNetSalaries);
        System.out.println("Total Bonuses Distributed: " + totalBonus);
    }
}
