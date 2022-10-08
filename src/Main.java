public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Виталий Иванович Кравчук", 1, 25794);
        employees[1] = new Employee("Олег Валерьевич Иванов", 2, 26448);
        employees[2] = new Employee("Иван Калыванович Земцов", 3, 70240);
        employees[3] = new Employee("Александр Данилович Соловьёв", 5, 60757);
        Employee kalyvanNagoryev = new Employee("Калыван Олегович Нагорьев", 4, 46520);
        addEmployee(kalyvanNagoryev);
        printEmployees();
        System.out.println("Ежемесячная сумма зарплат сотрудникам составляет " + calculationSalarySum());
        getMax();
        getMin();
        System.out.println("Средняя зарплата сотрудников составляет " + calculationAverageSalary());
        printName();
    }

    public static void addEmployee(Employee employee) {
        boolean storageSpace = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                storageSpace = true;
                employees[i] = employee;
                break;
            }
        }
        if (!storageSpace) {
            System.out.println("Нет места для заполнения данных");
        }
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculationSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null)
                sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static void getMax() {
        String name = employees[0].getName();
        int maxValue = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxValue) {
                    maxValue = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
        }
        System.out.println("Сотрудником с максимальной зарплатой является " + name + ", его зарплата составляет " + maxValue + " рублей");
    }
    public static void getMin() {
        String name = employees[0].getName();
        int minValue = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minValue) {
                    minValue = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
        }
        System.out.println("Сотрудником с минимальной зарплатой является " + name + ", его зарплата составляет " + minValue + " рублей");
    }

    public static int calculationAverageSalary() {
        int i = 0;
        while (i < employees.length && employees[i] != null) {
            i++;
        }
        return calculationSalarySum()/i;
    }

    public static void printName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }
}