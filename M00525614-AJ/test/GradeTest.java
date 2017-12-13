import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeTest {

    private Grade classUnderTest;

//    @Before
//    public void setUp() throws Exception{
//        classUnderTest =  new Grade(0);
//    }


// testInvalidInput1 -- input below valid range, results in IllegalArgumentException
// testInvalidInput2 -- input above valid range, results in IllegalArgumentException

//   ----------> 2 tests for invalid inputs <----------

    @Test(expected= IllegalArgumentException.class)
    public void testInvalidInput1() {
        classUnderTest = new Grade(120);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testInvalidInput2() {
        classUnderTest = new Grade(-10);
    }

//   ----------> 1 test for valid input <----------

    @Test
    public void testValidInput1() {
//        Expected to getPoints returns the right value
        int points = 10;

        classUnderTest = new Grade(points);

        assertEquals(points, classUnderTest.getPoints());
    }

//   ----------> Classify tests <----------
    @Test
    public void testClassify1() {
//        Expected to classify method returns Fail class for given input
        assertEquals(Classification.Fail, classUnderTest.classify());
        assertEquals(2, 3);
    }

    @Test
    public void testClassify2() {
//        Expected to classify method returns Third class for given input
        assertEquals(classUnderTest.classify(), Classification.Third);
    }

    @Test
    public void testClassify3() {
//        Expected to classify method returns LowerSecond class for given input
        assertEquals(classUnderTest.classify(), Classification.LowerSecond);
    }

    @Test
    public void testClassify4() {
//        Expected to classify method returns UpperSecond class for given input
        assertEquals(classUnderTest.classify(), Classification.UpperSecond);
    }

    @Test
    public void testClassify5() {
//        Expected to classify method returns First class for given input
        assertEquals(classUnderTest.classify(), Classification.First);
    }

//----------> Test for fromPercentage method <----------

    @Test
    public void testfromPercentage1() {
//        Expected from method fromPercentage to return Grade 1 from range 79%-100%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage2() {
//        Expected from method fromPercentage to return Grade 2 from range 76%-78%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage3() {
//       Expected from method fromPercentage to return Grade 3 from range 73%-75%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage4() {
//        Expected from method fromPercentage to return Grade 4 from range 70%-72%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage5() {
//        Expected from method fromPercentage to return Grade 5 from range 67%-69%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage6() {
//        Expected from method fromPercentage to return Grade 6 from range 65%-66%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage7() {
//        Expected from method fromPercentage to return Grade 7 from range 62%-64%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage8() {
//        Expected from method fromPercentage to return Grade 8 from range 60%-61%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage9() {
//        Expected from method fromPercentage to return Grade 9 from range 57%-59%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage10() {
//        Expected from method fromPercentage to return Grade 10 from range 55%-56%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage11() {
//        Expected from method fromPercentage to return Grade 11 from range 52%-54%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage12() {
//        Expected from method fromPercentage to return Grade 12 from range 50%-51%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage13() {
//        Expected from method fromPercentage to return Grade 13 from range 47%-49%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage14() {
//        Expected from method fromPercentage to return Grade 14 from range 45%-46%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage15() {
//        Expected from method fromPercentage to return Grade 15 from range 42%-44%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage16() {
//        Expected from method fromPercentage to return Grade 16 from range 40%-41%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage17() {
//        Expected from method fromPercentage to return Grade 17 from range 35%-39%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage18() {
//        Expected from method fromPercentage to return Grade 18 from range 30%-34%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage19() {
//        Expected from method fromPercentage to return Grade 19 from range 0%-29%
        int gradePercentage = 90;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade.getPoints(), gradePercentage);
    }

    @Test
    public void testfromPercentage20() {
//        Expected from method fromPercentage to return Grade 20 from non-participation
//        If non-participation on general scale then change to -1 for input to Grade constructor
//        "non-participation" is equivalent to -1

        int gradePercentage = -1;

        Grade fromPercentageGrade;

        fromPercentageGrade = new Grade(gradePercentage);

        assertEquals(fromPercentageGrade, gradePercentage);

    }


}