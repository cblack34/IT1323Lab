/*
* Name: Clayton Black
* Date: 09-16-2019
* Assignment Name: Lab Assignment 2B
* Assignment Brief: More Classes and Objects
* Sources:
* - https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Random.html
*/
import java.util.Random;

public class User {
    private String userID;
    private String password;
    private String reenteredPassword;
    private String email;
    private String lastName;
    private String firstName;
    private String zip;

    public User(String password, String reenteredPassword, String email, String lastName, String firstName, String zip) {
        this.password = password;
        this.reenteredPassword = reenteredPassword;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.zip = zip;

        this.userID = getUserID();
    }

    public String getUserID(){
        if (userID != null){
            return userID;
        } else {
            StringBuilder id = new StringBuilder();
            Random random = new Random();

            id.append(firstName.charAt(0));
            id.append(lastName.substring(lastName.length() - 2));
            id.append(zip.substring(0, 3));
            id.append(random.nextInt(1000));

            return id.toString();
        }
    }

    public boolean checkPassword(){
        if(password == reenteredPassword) {
            return true;
        } else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReenteredPassword() {
        return reenteredPassword;
    }

    public void setReenteredPassword(String reenteredPassword) {
        this.reenteredPassword = reenteredPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        userID = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        userID = null;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
        userID = null;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + getUserID() + '\'' +
                ", password='" + password + '\'' +
                ", reenteredPassword='" + reenteredPassword + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
