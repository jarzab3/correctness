import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Grade firstGrade = new Grade(2);
        Grade upperSecondGrade = new Grade(7);
        Grade lowerSecondGrade = new Grade(10);
        Grade thirdGrade = new Grade(15);
        Grade failGrade = new Grade(18);

        List<Grade> grades3Year = new ArrayList<>(Arrays.asList(firstGrade, firstGrade, thirdGrade, thirdGrade));
        List<Grade> grades2Year = new ArrayList<>(Arrays.asList(upperSecondGrade, upperSecondGrade, upperSecondGrade, firstGrade));

        Profile p1 = new Profile(grades2Year);
        Profile p2 = new Profile(grades3Year);

        System.out.println(p1.classify());
        System.out.println(p2.classify());

    }
}
