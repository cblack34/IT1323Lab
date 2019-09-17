/* 
* Name: Clayton Black
* Date: 09-16-2019
* Assignment Name: Lab Assignment 2B
* Assignment Brief: More Classes and Objects
* Sources:
* - https://nameberry.com/lists
*/

import java.util.Random;

public class Main {

    private static String [] names = {
            "Achilles",
            "Aesop",
            "Agatha",
            "Alexandra",
            "Anne",
            "Emma",
            "George",
            "Mary",
            "Robert",
            "Sophia",
            "Bowie",
            "Campbell",
            "Gardener",
            "Holland",
            "Justice",
            "Nova",
            "Oak",
            "Ripley",
            "Yarden",
            "Baldwin"
    };

    public static void main(String[] args) {
        int userCount = 2;

        User [] users = new User[userCount];

        Random random = new Random();

        for (int i = 0; i < userCount; i++) {
            System.out.println("\n\n################ User " + (i+1) + "################");
            String firstName = names[random.nextInt(names.length)];
            String lastName = names[random.nextInt(names.length)];
            String email = firstName.charAt(0) + lastName + "@gmail.com";
            String password = names[random.nextInt(names.length)] + random.nextInt(99999999) + names[random.nextInt(names.length)];

            users[i] = new User(password, password, email, lastName, firstName, String.valueOf(random.nextInt(90000) + 10000));

            System.out.println(users[i]);

            System.out.println(String.format("Old first name: %s", users[i].getFirstName()));
            System.out.println(String.format("Old last name: %s", users[i].getLastName()));
            System.out.println(String.format("Old email: %s", users[i].getEmail()));
            System.out.println(String.format("Old zip: %s", users[i].getZip()));
            System.out.println(String.format("Old password: %s", users[i].getPassword()));
            System.out.println(String.format("Old Re-entered Password: %s", users[i].getReenteredPassword()));
            System.out.println(String.format("Old UserID: %s", users[i].getUserID()));

            System.out.println("\n### Test checkPassword ###");
            System.out.println("The passwords match: " + users[i].checkPassword());
            System.out.println("## Change just ReenteredPassword ##");
            users[i].setReenteredPassword("changeme");
            System.out.println(String.format("\tpassword: %s", users[i].getPassword()));
            System.out.println(String.format("\tRe-entered Password: %s", users[i].getReenteredPassword()));
            System.out.println("The passwords match: " + users[i].checkPassword());

            firstName = names[random.nextInt(names.length)];
            lastName = names[random.nextInt(names.length)];
            email = firstName.charAt(0) + lastName + "@gmail.com";
            password = names[random.nextInt(names.length)] + random.nextInt(99999999) + names[random.nextInt(names.length)];

            System.out.println("\n### Change All values via mutators ###");
            users[i].setFirstName(firstName);
            users[i].setLastName(lastName);
            users[i].setEmail(email);
            users[i].setPassword(password);
            users[i].setReenteredPassword(password);
            users[i].setZip(String.valueOf(random.nextInt(90000) + 10000));

            System.out.println(users[i] + "\n\n");
        }

        System.out.println("################ Final toString for each user ################");

        for (User user : users){
            System.out.println(user);
        }
    }
}
