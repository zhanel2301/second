package models;
public class Person implements Payable, Comparable<Person>{
    private static int  id_gen=1;
    private int id;
    private String name;
    private String surname;

// default constructor:
    public Person(){
        id = id_gen++;
    }

    // parametrized constructor:
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    //getters and setters:
    public String getPosition() {
            return "Student";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }

    //overriding the getPaymentAmount() method:
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    //compareTo() method that compare based on the amount of money:
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    //toString():
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
