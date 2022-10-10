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
        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;

    }

    public int getSalary() {
        return this.salary;

    }

    public int getDepartment() {
        return this.department;
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
}
