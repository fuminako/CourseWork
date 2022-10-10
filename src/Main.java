public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Виталий Иванович Кравчук", 1, 25794);
        employees[1] = new Employee("Олег Валерьевич Иванов", 5, 26448);
        employees[2] = new Employee("Иван Калыванович Земцов", 3, 70240);
        employees[3] = new Employee("Александр Данилович Соловьёв", 5, 60757);
        Employee kalyvanNagoryev = new Employee("Калыван Олегович Нагорьев", 4, 46520);
        addEmployee(kalyvanNagoryev);

        printEmployees(5); // Часть 1 и 2
        getMax(5);
        getMin(5);
        System.out.println("Сумма зарплат по отделу составляет " + calculationSalarySum(5));
        calculationAverageSalary(5);
        getIncreaseSalary(4, 5);

        getNumber(46520); // Часть 3
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

    public static void printEmployees(int department) {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department) {
                Employee employee = employees[i];
                System.out.println("Сотрудник отдела " + department + " " + employee.getName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public static int calculationSalarySum(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department)
                sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static void getMax(int department) {
        String name = employees[0].getName();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxValue) {
                    maxValue = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
        }
        System.out.println("Сотрудником с максимальной зарплатой по отделу является " + name + ", его зарплата составляет " + maxValue + " рублей");
    }

    public static void getMin(int department) {
        String name = employees[0].getName();
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minValue) {
                    minValue = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
        }
        System.out.println("Сотрудником с минимальной зарплатой по отделу является " + name + ", его зарплата составляет " + minValue + " рублей");
    }

    public static void calculationAverageSalary(int department) {
        int employeeInDepartment = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department) {
                employeeInDepartment++;
            }
        }
        System.out.println("Средняя зарплата по отделу составляет " + calculationSalarySum(5) / employeeInDepartment);
    }

    public static void getIncreaseSalary(int increment, int department) {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getSalary() + employees[i].getSalary() * (increment * 0.01));
            }
        }
    }

    public static void getNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > number) {
                    System.out.println(" Id: " + employees[i].getId() + "; ФИО сотрудника: " + employees[i].getName() + "; Зарплата сотрудника: " + employees[i].getSalary() + " — зарплата больше чем " + number);
                } else if (employees[i].getSalary() < number) {
                    System.out.println(" Id: " + employees[i].getId() + "; ФИО сотрудника: " + employees[i].getName() + "; Зарплата сотрудника: " + employees[i].getSalary() + " — зарплата меньше " + number);
                } else
                    System.out.println(" Id: " + employees[i].getId() + "; ФИО сотрудника: " + employees[i].getName() + "; Зарплата сотрудника: " + employees[i].getSalary() + " — зарплата равна " + number);
            }
        }
    }
}