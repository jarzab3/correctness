import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProfileTest {

    private Profile classUnderTest;

//  ----------> 3 tests for invalid intput to ProfileTest constructor <----------

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput1() {
//        classUnderTest = new Grade(120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput2() {
//        classUnderTest = new Grade(120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput3() {
//  classUnderTest = new Grade(120);
    }

//  ----------> 6 tests for each possible combination of Classification and truth value <----------
//   Possible profiles to be tested (Third, LowerSecond, UpperSecond, First)
//   When isClear return true the current profile is clear if false then the profile is borderline
//   If grades for profile more than 25% of total grades for profile then it is a borderline

//  1 possibility

//  first and second can be either border or clear

    @Test
    public void testProfileClassificationThirdClear() {
//  Expected to classify method return Third class for given input

        assertEquals(classUnderTest.classify(), Classification.Third);
    }

    @Test
    public void testProfileClassificationLowerSecondClear() {
//  Expected to classify method return Third class for given input

        assertEquals(classUnderTest.classify(), Classification.LowerSecond);
    }


    @Test
    public void testProfileClassificationUpperSecondBorderline() {
//  Expect to classify method return UpperSecond class and isClear method will return false which means that the class is borderline


        boolean isClear = classUnderTest.isClear();

        assertEquals(classUnderTest.classify(), Classification.Third);
        assertEquals(classUnderTest.isClear(), isClear);
    }

    @Test
    public void testProfileClassificationUpperSecondClear() {
//  Expect to classify method return UpperSecond class and isClear method will return true which means that the class is clear
        List<Grade> listOfGrades = new ArrayList<Grade>();

        Profile testProfile = new Profile(listOfGrades);

        boolean clear = true;

        assertEquals(testProfile.classify(), Classification.UpperSecond);
        assertEquals(testProfile.isClear(), clear);
    }

    @Test
    public void testProfileClassificationFirstBorderline() {
//  Expect to classify method return First class and isClear method will return false which means that the class is borderline
        List<Grade> listOfGrades = new ArrayList<Grade>();

        Profile testProfile = new Profile(listOfGrades);

        boolean clear = true;

        assertEquals(testProfile.classify(), Classification.UpperSecond);
        assertEquals(testProfile.isClear(), clear);
    }

    @Test
    public void testProfileClassificationFirstClear() {
//  Expect to classify method return First class and isClear method will return true which means that the class is clear
        List<Grade> listOfGrades = new ArrayList<Grade>();

        Profile testProfile = new Profile(listOfGrades);

        boolean clear = true;

        assertEquals(testProfile.classify(), Classification.UpperSecond);
        assertEquals(testProfile.isClear(), clear);
    }


}