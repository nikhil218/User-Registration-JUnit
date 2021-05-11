package com.user;

import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistration{
    boolean valid(String pattern, String param);
}

public class userRegistration {
    private static final String patternForName = "[A-Z]{1}[a-z]{2,}";
    private static final String patternForEmail = "^[a-zA-Z0-9]+(?:[\\.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z]{1,}+)*$";
    private static final String patternForPhoneNumber = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String patternForPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[-+_!@#$%^&*., ?]).{8,}$";

    IUserRegistration result = (pattern, input) -> Pattern.compile(pattern).matcher(input).matches();

    public boolean firstName(String FirstName) throws userRegistrationException {
        if(result.valid(patternForName, FirstName))
            return true;
        else
            throw new userRegistrationException("Invalid First name");
    }

    public boolean lastName(String LastName) throws userRegistrationException{
        if(result.valid(patternForName, LastName))
            return true;
        else
            throw new userRegistrationException("Invalid Last name");
    }

    public boolean email( String email) throws userRegistrationException{
        if(result.valid(patternForEmail, email))
            return true;
        else
            throw new userRegistrationException("Invalid Email");
    }

    public boolean phoneNumber(String phoneNumber) throws userRegistrationException{
        if(result.valid(patternForPhoneNumber, phoneNumber))
            return true;
        else
            throw new userRegistrationException("Invalid Phone number");
    }

    public boolean password(String Password) throws userRegistrationException{
        if(result.valid(patternForPassword, Password))
            return true;
        else
            throw new userRegistrationException("Invalid Password");
    }

}