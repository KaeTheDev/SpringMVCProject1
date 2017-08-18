package com.test.util;


public class Users
{
    private String firstname;
    private String lastname;
    private String email;
    private long phonenumber;
    private String password;

    //No Args Constructor
    public Users()
    {
        firstname = "";
        lastname = "";
        email = "";
        phonenumber = 0;
        password = "";
    }


    //All Args Constructor

    public Users(String firstname, String lastname, String email, long phonenumber, String password)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    //Getter and Setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
