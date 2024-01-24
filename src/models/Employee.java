package models;

public class Employee extends Person { //inherits from the Person class
    private String position; //storing the employee's position
    private double salary; //storing the employee's salary

//  default constructor:
    public Employee() {
    }

//  parametrized constructor Employee that takes four parameters: name, surname, position, salary
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname); //calls the constructor of the parent class (Person)
        setPosition(position); //calls the setName method to set the name
        setSalary(salary); //calls the setSalary method to set the salary
    }

//  getters and setters:
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

//  overridden the getPaymentAmount() method:
    @Override
    public double getPaymentAmount() {
        return getSalary(); //returns the salary of the employee as the payment amount
    }

//  overridden toString() method:
    @Override
    public String toString() {
        return "Employee: " + super.toString(); //returns Employee: id. name surname
    }
}

