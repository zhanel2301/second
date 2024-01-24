package models;

public class Student extends Person {
    private double gpa;

    // default constructor:
    public Student() {
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    // parametrized constructor:
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    } //setter
    public double getGpa() { //getter
        return gpa;
    }

    //overriding the getPaymentAmount() method:
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67)
            return 36660.00;
        else
            return 0.00;
    }

    //toString():
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}