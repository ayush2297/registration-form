package com.bridgelabz.test;

import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import java.util.Arrays;
        import java.util.Collection;
        import java.util.Iterator;
public class FormValidationTest
{
    FormValidation formValidation = new FormValidation();

    @Test
    public void givenFirstName_WhenCorrect_ReturnsTrue()
    {
        boolean fname = formValidation.check_Name("Ayush");
        Assert.assertTrue(fname);
    }

    @Test
    public void givenFirstName_WhenPassedSpChar_ReturnsFalse()
    {
        boolean fname = formValidation.check_Name("A@yush");
        Assert.assertFalse(fname);
    }

    @Test
    public void givenFirstName_WhenStartsWithSmallChar_ReturnsFalse()
    {
        boolean fname = formValidation.check_Name("ayush");
        Assert.assertFalse(fname);
    }

    @Test
    public void givenFirstName_WhenPassedNumeric_ReturnsFalse()
    {
        boolean fname = formValidation.check_Name("ayu123");
        Assert.assertFalse(fname);
    }

    @Test
    public void givenFirstName_WhenPassedMultipleCaps_ReturnsFalse()
    {
        boolean fname = formValidation.check_Name("AYUSH");
        Assert.assertFalse(fname);
    }

    @Test
    public void givenFirstName_WhenHasLengthLessThanThree_ReturnsFalse()
    {
        boolean fname = formValidation.check_Name("AY");
        Assert.assertFalse(fname);

    }

    @Test
    public void givenLastName_WhenCorrect_ReturnsTrue()
    {
        boolean lname = formValidation.check_Name("Saraf");
        Assert.assertTrue(lname);
    }


    @Test
    public void givenLastName_WhenContainsSpChar_ReturnsFalse()
    {
        boolean lname = formValidation.check_Name("Sar@f");
        Assert.assertFalse(lname);
    }

    @Test
    public void givenLastName_WhenStartsWithSmallChar_ReturnsFalse()
    {
        boolean lname = formValidation.check_Name("saraf");
        Assert.assertFalse(lname);
    }

    @Test
    public void givenLastName_WhenPassedNumeric_ReturnsFalse()
    {
        boolean lname = formValidation.check_Name("Sara7");
        Assert.assertFalse(lname);
    }

    @Test
    public void givenLastName_WhenPassedMultipleCaps_ReturnsFalse()
    {
        boolean lname = formValidation.check_Name("SarAf");
        Assert.assertFalse(lname);
    }

    @Test
    public void givenLastName_WhenHasLengthLessThanThree_ReturnsFalse()
    {
        boolean lname = formValidation.check_Name("Sa");
        Assert.assertFalse(lname);

    }

}
