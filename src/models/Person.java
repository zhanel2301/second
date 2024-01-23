package models;
public class Person implements Payable, Comparable<Person>{
    private static int  id_gen=1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
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
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
