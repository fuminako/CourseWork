import java.util.Objects;

public class Employee {
    private final String name;
    private int salary;
    private int department;
    private static int counter = 0;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public int getSalary() {
        return salary;

    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "ФИО сотрудника: " + name + "; Отдел сотрудника: " + department + "; Зарплата сотрудника: " + salary + " Id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department, id);
    }
}
