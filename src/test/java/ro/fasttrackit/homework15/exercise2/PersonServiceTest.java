package ro.fasttrackit.homework15.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonServiceTest {
    PersonService personService;

    @BeforeEach
    void setup() {
        personService = new PersonService(List.of(
                new Person(1, "George", 35),
                new Person(2, "Ana", 27),
                new Person(3, "Mihai", 48),
                new Person(4, "Andreea", 19),
                new Person(5, "Cristi", 23)
        ));
    }

    @Test
    @DisplayName("remove person works")
    void removePerson() {
        assertThat(personService.removePerson(1)).isEqualTo(new Person(1, "George", 35));
        assertThat(personService.removePerson(5)).isEqualTo(new Person(5, "Cristi", 23));
        assertThat(personService.removePerson(8)).isEqualTo(null);
    }

    @Test
    @DisplayName("get all persons works")
    void getAllPersons() {
        assertThat(personService.getAllPersons()).isEqualTo(List.of(
                new Person(1, "George", 35),
                new Person(2, "Ana", 27),
                new Person(3, "Mihai", 48),
                new Person(4, "Andreea", 19),
                new Person(5, "Cristi", 23)
        ));
    }

    @Test
    @DisplayName("get person older than works")
    void getPersonsOlderThan() {
        assertThat(personService.getPersonsOlderThan(30)).isEqualTo(List.of(
                new Person(1, "George", 35),
                new Person(3, "Mihai", 48)
        ));
        assertThat(personService.getPersonsOlderThan(25)).isEqualTo(List.of(
                new Person(1, "George", 35),
                new Person(2, "Ana", 27),
                new Person(3, "Mihai", 48)
        ));
        assertThat(personService.getPersonsOlderThan(121)).isEqualTo(List.of());

    }

    @Test
    @DisplayName("get all persons names works")
    void getAllPersonNames() {
        assertThat(personService.getAllPersonNames()).isEqualTo(List.of("George", "Ana", "Mihai", "Andreea", "Cristi"));
    }

    @Test
    @DisplayName("get persons by name works")
    void getPersonByName() {
        assertThat(personService.getPersonByName("Ana")).isEqualTo(List.of(new Person(2, "Ana", 27)));
        assertThat(personService.getPersonByName("Ion")).isEqualTo(List.of());
        assertThat(personService.getPersonByName("")).isEqualTo(List.of());
    }

    @Test
    @DisplayName("get persons by id works")
    void getPersonById() {
        assertThat(personService.getPersonById(2)).isEqualTo(List.of(new Person(2, "Ana", 27)));
        assertThat(personService.getPersonById(7)).isEqualTo(List.of());
        assertThat(personService.getPersonById(-1)).isEqualTo(List.of());
    }
}
