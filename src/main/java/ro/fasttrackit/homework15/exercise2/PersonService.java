package ro.fasttrackit.homework15.exercise2;

/*mai am de lucru pe partea de exceptii/testing,in masura
 in care finalizez o sa dau commit si la restul exercitiului*/

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Person addPerson(String name, int age) {
        int id = maxId();
        Person result = new Person(id, name, age);
        result.setId(++id);
        //ce alternative pot folosi aici ca sa generez un id unic?
        persons.add(result);
        return result;
    }

    private int maxId() {
        int result = 0;
        for (Person person : persons) {
            if (person.getId() > result) {
                result = person.getId();
            }
        }
        return result;
    }

    public Person removePerson(int id) throws IdNotFoundException {
        for (Person person : persons) {
            if (person.getId() == id) {
                persons.remove(person);
                return person;
            } /*else {
                throw new IdNotFoundException("Activity with id " + id + " not found");
            }*/
        }
        return null;
    }

    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public List<Person> getPersonByName(String name) throws PersonNotFoundException {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                result.add(person);
            }

        }
        return result;
    }

    public List<Person> getPersonById(int id) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getId() == id) {
                result.add(person);
            }
        }
        return result;
    }
}

