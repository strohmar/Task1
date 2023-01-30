package register;

import java.util.*;

public class Admin extends UserAbstract {
    private List<User> userList = new ArrayList<>();
    private List<Person> personList = new ArrayList<>();

    public Admin(String username, String password) {
        super(username, password);
    }

    public List<Person> getPersonList() {
        return this.personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPersonToList(Person person) {
        this.personList.add(person);
    }

    public List<User> getUserList() {
        return this.userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


    public void addUserToList(User user) {
        this.userList.add(user);
    }


    public Person getPerson(String socialSecurityNumber) {
        for (Person person : getPersonList()) {
            if (person.getSocialSecurityNumber().equals(socialSecurityNumber)) {
                return person;
            }
        }
        return null;
    }

    public User getUser(String username) {
        for (User user : getUserList()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void removePerson(String socialSecurityNumber) {
        Person person = getPerson(socialSecurityNumber);
        this.personList.remove(person);
    }

    public void removeUser(String username) {
        User user = getUser(username);
        getUserList().remove(user);

    }

    public void save() {
        //functionality for persisting object.
    }
}
