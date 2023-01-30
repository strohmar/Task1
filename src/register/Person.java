package register;

import java.util.List;

public class Person {

    private String surname;
    private List<String> names;
    private String socialSecurityNumber;
    private List<String> citizenships;
    private String language;
    private String gender;
    private boolean maritalStatus;
    private String occupation;


    public Person(String surname, List<String> names, String socialSecurityNumber, List<String> citizenships,
                  String language, String gender, boolean maritalStatus, String occupation) {
        this.surname = surname;
        this.names = names;
        this.socialSecurityNumber = socialSecurityNumber;
        this.citizenships = citizenships;
        this.language = language;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.occupation = occupation;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public List<String> getCitizenships() {
        return citizenships;
    }

    public void setCitizenships(List<String> citizenships) {
        this.citizenships = citizenships;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void save() {
        //functionality for persisting object.
    }

    public String getNamesAsString() {
        String namesAsString = "";
        for (String name : this.names) {
            namesAsString += name + " ";
        }
        return namesAsString;
    }

    public String getCitizenshipsAsString() {
        String citizenshipsAsString = "";
        for (String citizenship : this.citizenships) {
            citizenshipsAsString += citizenship + " ";
        }
        return citizenshipsAsString;
    }

    @Override
    public String toString() {
        return "surname: " + surname + "\nnames: " + getNamesAsString() + "\nsocial security number: "
                + socialSecurityNumber + "\ncitizenships: " + getCitizenshipsAsString() + "\nlanguage: " + language
                + "\ngender: " + gender + "\nmarital status: " + maritalStatus + "\noccupation: " + occupation;
    }

}
