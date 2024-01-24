package models;

//abstract class Person. This class implements the Payable and Comparable interfaces
public abstract class Person implements Payable, Comparable<Person>{
    private static int  id_gen=1; //each new Person object will be assigned a unique id
    private int id; //storing the unique id, which will be automatically assigned to each object upon creation
    private String name; //storing the person's name
    private String surname; //storing the person's surname

// default constructor:
    public Person(){
        id = id_gen++; //increments the id_gen and assigns the value to the id
    }

    // parametrized constructor that takes two parameters: name and surname:
    public Person(String name, String surname){
        this(); //calls the default constructor to set the id
        setName(name);
        setSurname(surname);//sets the name and surname using the provided parameters
    }

    //getters and setters:
    public abstract String getPosition(); //an abstract method for getting the position, to be implemented by subclasses
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
        return 0.00; //returns a default value of 0.00
    }

    //compareTo() method that compares two Person objects based on their payment amounts using Double.compare()
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    //toString() method:
    @Override
    public String toString() {
        return id + ". " + name + " " + surname; //returns a string representation of the Person object in the format: id. name surname
    }
}
