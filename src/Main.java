import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>(); //creates an ArrayList of type Person
//  adds instances of Employee and Student to the people list:
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.0));

        Collections.sort(people); //sorts the list based on payment amounts
        printData(people); //method to print details of each person
    }
//  printData method takes an Iterable collection of type Person as a parameter:
    private static void printData(Iterable<Person> people) {
        for (Person person: people) { //iterates through each Person object in the people collection
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge"); //prints details of each person
        }
    }
}