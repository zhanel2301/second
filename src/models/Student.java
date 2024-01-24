package models;

public class Student extends Person { //inherits from the Person class
    private double gpa;

//  default constructor:
    public Student() {
    }

//  parametrized constructor that takes three parameters: name, surname, gpa
    public Student(String name, String surname, double gpa) {
        super(name, surname); //calls the constructor of the parent class (Person)
        setGpa(gpa); //calls the setGpa method to set the gpa
    }
//  setter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
//  getter
    public double getGpa() {
        return gpa;
    }

//  overridden the getPaymentAmount() method: checks if the student's gpa is greater than 2.67
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67)
            return 36660.00; //if true, returns a constant stipend amount
        else
            return 0.00;
    }

//  overridden the getPosition() method:
    @Override
    public String getPosition() {
        return "Student"; //returns the string "Student"
    }
//  overridden toString() method:
    @Override
    public String toString() {
        return "Student: " + super.toString(); //returns Student: id. name surname
    }
}