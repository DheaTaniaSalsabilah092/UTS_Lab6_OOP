package Soal3;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + ID + ",name=" + getName() + ",salary=" + salary + "]";
    }
}


