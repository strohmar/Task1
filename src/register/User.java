package register;

public class User extends UserAbstract {

    private Person person;

    public User(String username, String password) {
        super(username, password);
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void save() {
        //functionality for persisting object.
    }
    @Override
    public String toString() {
        String userInfo = "username: " + this.getUsername();
        if (this.person != null) {
            return userInfo + "\n\tassosiated person info\n" + this.person;
        }
        return userInfo;
    }
}
