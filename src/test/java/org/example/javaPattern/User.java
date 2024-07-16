package org.example.javaPattern;

import java.util.Date;

public class User {
    private String firstname;
    private String lastname;
    private String jobTitle;
    private String highestLevelofEducation;
    private String gender;
    private int yearsOfExperience;
    private Date date;


    User(String firstname, String lastname, String jobTitle, String highestLevelofEducation, String gender, int yearsOfExperience, Date date)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.jobTitle=jobTitle;
        this.highestLevelofEducation=highestLevelofEducation;
        this.gender=gender;
        this.yearsOfExperience=yearsOfExperience;
        this.date=date;
    }



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getHighestLevelofEducation() {
        return highestLevelofEducation;
    }

    public String getGender() {
        return gender;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Date getDate() {
        return date;
    }


    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' + "\n"+
                "lastname='" + lastname + '\'' +"\n"+
                "jobTitle='" + jobTitle + '\'' +"\n"+
                "highestLevelofEducation='" + highestLevelofEducation + '\'' +"\n"+
                "gender, ='" + gender + '\'' +"\n"+
                "yearsOfExperience='" + yearsOfExperience + '\'' +"\n"+

                ", date='" + date + '\'' +"\n"+
                '}';
    }
}
