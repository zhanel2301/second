package models;

public class Employee extends Person {
    private String position;
    private double salary;

    // default constructor:
    public Employee() {
    }

    // parametrized constructor:
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    //getters and setters:
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    //overriding the getPaymentAmount() method:
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    //toString():
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

