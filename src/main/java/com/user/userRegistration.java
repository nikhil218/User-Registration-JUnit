package com.user;

import java.util.regex.Pattern;

public class userRegistration {
    public boolean result;
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";
    private static final String patternForNumber = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String patternForPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[-+_!@#$%^&*., ?]).{8,}$";

    public boolean firstName(String FirstName) throws userRegistrationException {
        if(!Pattern.compile(patternForName).matcher(FirstName).matches());
            throw new userRegistrationException("Invalid Frst name");
    }

    public boolean lastName(String LastName) throws userRegistrationException{
        if(!Pattern.compile(patternForName).matcher(LastName).matches());
            throw new userRegistrationException("Invalid Last name");
    }

    public boolean email( String email) throws userRegistrationException{
        if(!Pattern.compile(patternForEmail).matcher(email).matches());
            throw new userRegistrationException("Invalid Email");
    }

    public boolean phoneNumber(String Number) throws userRegistrationException{
        if(!Pattern.compile(patternForNumber).matcher(Number).matches());
            throw new userRegistrationException("Invalid Phone number");
    }

    public boolean password(String Password) throws userRegistrationException{
        if(!Pattern.compile(patternForPassword).matcher(Password).matches());
            throw new userRegistrationException("Invalid Password");
    }
    public boolean checkEmail(String email){
        result = Pattern.compile(patternForEmail).matcher(email).matches();
        return result;
    }
}