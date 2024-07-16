package org.example.javaPattern;

import java.util.Date;

public class UserBuilder {
    private String firstname;
    private String lastname;
    private String jobTitle;
    private String highestLevelofEducation;
    private String gender;
    private int yearsOfExperience;
    private Date date;

    public UserBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public UserBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserBuilder setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public UserBuilder setHighestLevelofEducation(String highestLevelofEducation) {
        this.highestLevelofEducation = highestLevelofEducation;
        return this;
    }

    public UserBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public UserBuilder setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public UserBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public User createUser() {
        return new User(firstname, lastname, jobTitle, highestLevelofEducation, gender, yearsOfExperience, date);
    }
}