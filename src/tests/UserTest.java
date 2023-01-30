package tests;

import org.junit.jupiter.api.*;
import register.Person;
import register.User;

import java.util.List;

class UserTest {
    private User user;
    private Person person;

    @BeforeEach
    void setUp() {
        user = new User("Matty", "Tomas");

        person = new Person("Tomba", List.of("Mathew", "Jackson"), "311299-9872",
                List.of("United-Kingdom", "Japan", "Finland"), "English", "male", false,
                "Translator");

    }

    @Test
    @DisplayName("Printing user which has a person should print out the persons information")
    void addPersonToUserAndThenPrintTheUser() {
        user.setPerson(person);
        Assertions.assertTrue(user.toString().contains("311299-9872"));
    }

    @Test
    @DisplayName("Printing user which doesn't have a person should work")
    void printUserWithoutPerson() {
        user.setPerson(null);
        Assertions.assertEquals(user.toString(), "username: Matty");
    }
}