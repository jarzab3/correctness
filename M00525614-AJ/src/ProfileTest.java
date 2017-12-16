import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileTest {

    private Profile classUnderTest;

    //    Grades for testing
    Grade firstGrade = new Grade(2);
    Grade upperSecondGrade = new Grade(7);
    Grade lowerSecondGrade = new Grade(10);
    Grade thirdGrade = new Grade(15);
    Grade failGrade = new Grade(18);

//  ----------> 3 tests for invalid input to ProfileTest constructor <----------

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput1() {
//        Test for third grade in the list of grades
        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(thirdGrade, firstGrade, failGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput2() {
//      Test if the list of grades is null
        List<Grade> grades2Year = null;

        classUnderTest = new Profile(grades2Year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput3() {
//  Test if the list of grades is empty

        List<Grade> grades2Year = new ArrayList<>(Arrays.asList());

        classUnderTest = new Profile(grades2Year);
    }

//  ----------> 6 tests for each possible combination of Classification and truth value <----------
//   Possible profiles to be tested (Third, LowerSecond, UpperSecond, First)
//   When isClear return true the current profile is clear if false then the profile is borderline
//   If grades for profile more than 25% of total grades for profile then it is a borderline

    @Test
    public void testProfileClassificationThirdClear() {
//  Expected to classify method return Third class for given input

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(thirdGrade, firstGrade, thirdGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.Third);
    }

    @Test
    public void testProfileClassificationLowerSecondClear() {
//  Expected to classify method return Third class for given input

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(thirdGrade, lowerSecondGrade, lowerSecondGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.LowerSecond);
    }


    @Test
    public void testProfileClassificationUpperSecondBorderline() {
//  Expect to classify method return UpperSecond class and isClear method will return false which means that the class is borderline

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(upperSecondGrade, thirdGrade, upperSecondGrade, firstGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.UpperSecond);

        assertEquals(classUnderTest.isClear(), true);
    }

    @Test
    public void testProfileClassificationUpperSecondClear() {
//  Expect to classify method return UpperSecond class and isClear method will return true which means that the class is clear
        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, firstGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.UpperSecond);
        assertEquals(classUnderTest.isClear(), true);
    }

    @Test
    public void testProfileClassificationFirstBorderline() {
//  Expect to classify method return First class and isClear method will return false which means that the class is borderline

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(thirdGrade, firstGrade, firstGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.First);
        assertEquals(classUnderTest.isClear(), false);
    }

    @Test
    public void testProfileClassificationFirstClear() {
//  Expect to classify method return First class and isClear method will return true which means that the class is clear

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, upperSecondGrade, thirdGrade));

        classUnderTest = new Profile(grades3Year);

        assertEquals(classUnderTest.classify(), Classification.First);
        assertEquals(classUnderTest.isClear(), true);
    }


}