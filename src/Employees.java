public class Employees {

    private String fullName;
    private double salary;
    private int department;
    private int id;

    private static int counter = 0;

    public Employees(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        counter++;
        id = counter;
    }

    @Override
    public String toString() {
       return id + ". " + fullName + ". Номер отдела- " + department + ". Заработная плата: " + salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


}
