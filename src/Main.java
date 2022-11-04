public class Main {
    private static Employees[] employees;

    public static void main(String[] args) {

        employees = new Employees[10];
        employees[0] = new Employees("Андреев Андрей Андреевич", 1, 50_000.5);
        employees[1] = new Employees("Борисов Борис Борисович", 2, 18_000.5);
        employees[2] = new Employees("Володин Владимир Владимирович", 3, 100_000.5);
        employees[3] = new Employees("Григорьев Григорий Григорьевич", 4, 150_000.5);
        employees[4] = new Employees("Денисов Денис Денисович", 5, 250_000.5);
        employees[5] = new Employees("Егоров Егор Егорович", 1, 60_000);
        employees[6] = new Employees("Иванов Иван Иванович", 1, 50_000.5);
        employees[7] = new Employees("Константинов Константин Константинович", 5, 150_000);
        employees[8] = new Employees("Леонтьев Леонид Львович", 2, 31_000);
        employees[9] = new Employees("Михайлов Михаил Михайлович", 5, 300_000);

        printEmployees();
        System.out.println("Сумма заработных плат всех сотрудников: " + sumSalaries());
        System.out.println("Минимальная зарплата: " + minSalaryEmployee());
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee());
        System.out.println("Средняя зарплата всех сотрудников: "+averageSalary());
        printFulNames();
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
    public static double sumSalaries() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum += employees[i].getSalary();
        }
        return sum;
    }

    public static Employees minSalaryEmployee() {
        Employees result = employees[0];
        double min = 1000000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }
    public static Employees maxSalaryEmployee() {
        Employees result = employees[0];
        double max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }
    public static double averageSalary() {
        int counterNotNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterNotNull++;
            }
        }
        return sumSalaries() / counterNotNull;
    }
    public static void printFulNames() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }

            }
    }
}
