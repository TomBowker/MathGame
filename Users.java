package com.mycompany;

/**
 * Created by 90tombowker on 3/10/16.
 */
public class Users {
    // Global info about Users
    int age;
    String name, gender;

    public enum personGender {
        BOY,
        GIRL
    }

    // User method
    public boolean users (String userName, int userAge, String userGender) {

        age = userAge;
        name = userName.trim();
        gender = userGender.trim();

        if (!gender.equalsIgnoreCase(personGender.BOY.name()) &&
                !gender.equalsIgnoreCase(personGender.GIRL.name()) ||
                name.isEmpty() || age <= 0) {

            System.out.println("Sorry you need to fill out your information first");
            return false;
        }

        System.out.println("Welcome, Let's learn!");
        return true;
    }
}
