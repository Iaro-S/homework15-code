package ro.fasttrackit.homework15.exercise2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IdNotFoundException {
        PersonService persons = new PersonService(List.of(
                new Person(1, "George", 35),
                new Person(2, "Ana", 27),
                new Person(3, "Mihai", 48),
                new Person(4, "Andreea", 19),
                new Person(5, "Cristi", 23)
        ));
        System.out.println("Removed Person from list is: " + persons.removePerson(8) + "\n");
        System.out.println("Removed Person from list is: " + persons.removePerson(3) + "\n");
        System.out.println("Full list of persons: " + persons.getAllPersons() + "\n");
        System.out.println("Person older than selected age: " + persons.getPersonsOlderThan(25) + "\n");
        //System.out.println("Person older than selected age: " + persons.getPersonsOlderThan(-3) + "\n");
        System.out.println("List of names: " + persons.getAllPersonNames() + "\n");
        System.out.println("Found person by name: " + persons.getPersonByName("Andreea") + "\n");
        System.out.println("Found person by name: " + persons.getPersonByName("Gica") + "\n");
        System.out.println("Found person by id: " + persons.getPersonById(5) + "\n");
        System.out.println("Add new person: " + persons.addPerson("Maria", 55) + "\n");
        System.out.println("Removed Person from list is: " + persons.removePerson(5) + "\n");
        System.out.println("Add new person: " + persons.addPerson("Mihai", 33));
    }
}
