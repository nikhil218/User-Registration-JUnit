package com.user;

import java.util.regex.Pattern;

public class ur {
    public boolean result;
    private static final String patternForFirstName = "[A-Z]{1}[a-z]{2,}";

    public boolean FirstName(String FirstName) {
        result = Pattern.compile(patternForFirstName).matcher(FirstName).matches();
        return result;
    }
}