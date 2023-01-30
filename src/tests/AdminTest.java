package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import register.Admin;
import register.Person;
import register.User;

import java.util.List;

class AdminTest {
    private Admin admin;
    private User user1, user2, user3;

    private Person person1, person2, person3;


    @BeforeEach
    void setUp() {
        admin = new Admin("Administrator", "Password");

        user1 = new User("Mathew", "Mathew");
        user2 = new User("Fred", "Fred");
        user3 = new User("Tomas", "Tomas");

        person1 = new Person("William", List.of("Mathew", "Jackson"), "311299-9872",
                List.of("United-Kingdom"), "English", "male", false, "");
        person2 = new Person("Storm", List.of("Emily", "Lily"), "301192-9872",
                List.of("Finland", "United-Kingdom"), "Finnish", "female", true, "Musician");
        person3 = new Person("Karjalainen", List.of("Mari", "Tiina"), "030598-052b",
                List.of("Finland"), "Finnish", "female", true, "Welder");

    }

    @Test
    @DisplayName("Adding and removing users should work")
    void addAndRemoveUser() {
        admin.addUserToList(user1);
        admin.addUserToList(user2);
        admin.removeUser("Mathew");

        Assertions.assertEquals(admin.getUserList().size(), 1);
        Assertions.assertEquals(admin.getUser("Fred"), user2);

    }

    @Test
    @DisplayName("Adding and removing persons should work")
    void addAndRemovePerson() {
        admin.addPersonToList(person1);
        admin.addPersonToList(person2);
        admin.removePerson("301192-9872");

        Assertions.assertEquals(admin.getPersonList().size(), 1);
        Assertions.assertEquals(admin.getPerson("311299-9872"), person1);
    }

    @Test
    @DisplayName("Adding a person to a user which has been added to admin should work")
    void addUserThenAddPersonToThatUser() {
        admin.addUserToList(user3);
        user3.setPerson(person3);
        Assertions.assertEquals(admin.getUser("Tomas").getPerson(), person3);
    }
}