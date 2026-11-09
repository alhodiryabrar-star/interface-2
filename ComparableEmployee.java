
package abrar;

public interface ComparableEmployee extends Comparable<Employee> {
    int compareTo(Employee other);
}