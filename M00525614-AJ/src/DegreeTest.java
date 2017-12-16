import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DegreeTest {

//    Grades used for testing
    Grade firstGrade = new Grade(2);
    Grade upperSecondGrade = new Grade(7);
    Grade lowerSecondGrade = new Grade(10);
    Grade thirdGrade = new Grade(15);
    Grade failGrade = new Grade(18);


//  ----------> 3 tests for invalid input to Degree constructor <----------

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput1() {
//  Expected to Degree constructor will throw an error for given input, null input

        Degree degreeTest = new Degree(null,null );

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput2() {
//  Expected to Degree constructor will throw an error for given input, lists are empty

        List<Grade> year2Grades = new ArrayList<Grade>();
        List<Grade> year3Grades = new ArrayList<Grade>();


        Degree degreeTest = new Degree(year2Grades, year3Grades );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailInput3() {
//  Expected to Degree constructor will throw an error for given input, one of the grades is 'Fail'

        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(failGrade, firstGrade));
        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(thirdGrade, upperSecondGrade));

        Degree degreeTest = new Degree(year2Grades, year3Grades );

    }

//   ----------> 5 tests for degree classifications<----------


    @Test
    public void testDegree1() {
//  Expected degree classify method to return the same degree is both profiles are the same

        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, firstGrade, firstGrade));
        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, firstGrade, firstGrade));

//        Profile level5Profile =  new Profile(year2Grades);
//        Profile level6Profile =  new Profile(year3Grades);

        Degree degreeTest = new Degree(year2Grades, year3Grades);

        assertEquals(degreeTest.classify(), Classification.First);

    }

    @Test
    public void testDegree2() {
//  Expected degree classify method to return higher grade because level 6 profile is better and is clear

        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, firstGrade, firstGrade));
        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, upperSecondGrade, upperSecondGrade));

        Profile level6Profile =  new Profile(year3Grades);

        assertEquals(level6Profile.isClear(), true);

        Degree degreeTest = new Degree(year2Grades, year3Grades);

        assertEquals(degreeTest.classify(), Classification.First);

    }


    @Test
    public void testDegree3() {
//  Expected degree classify method to return higher grade because level 5 profile is better and is clear

        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, upperSecondGrade, upperSecondGrade));
        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, firstGrade, firstGrade));

        Profile level5Profile =  new Profile(year2Grades);

        Degree degreeTest = new Degree(year2Grades, year3Grades);

        assertEquals(level5Profile.isClear(), true);

        assertEquals(degreeTest.classify(), Classification.First);

    }


    @Test
    public void testDegree4() {
//  Expected degree classify method to return the Discretion degree
        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, upperSecondGrade, upperSecondGrade));
        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, upperSecondGrade, upperSecondGrade));

        Degree degreeTest = new Degree(year2Grades, year3Grades);

        assertEquals(degreeTest.classify(), Classification.UpperSecond);

    }

    @Test
    public void testDegree5() {
//  Expected degree classify method to return the Discretion degree

        List<Grade> year2Grades = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, firstGrade, firstGrade));
        List<Grade> year3Grades = new ArrayList<>(Arrays.asList(thirdGrade, thirdGrade, thirdGrade, thirdGrade));

        Degree degreeTest = new Degree(year2Grades, year3Grades);

        assertEquals(degreeTest.classify(), Classification.Discretion);

    }








}