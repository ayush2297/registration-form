package com.bridgelabz.test;
import java.util.regex.*;

public class FormValidation
{


    public boolean check_Name(String name)
    {
        Pattern NAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = NAME_PATTERN.matcher(name);
        if (match.matches())
            return true;
        return false;
    }



}
