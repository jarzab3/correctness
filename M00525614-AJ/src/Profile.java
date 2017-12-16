import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Profile {
    // Your additions/changes below this line

    //  Declare variable to count grades in the list.
    private int third, lowerSecond, upperSecond, first;

    private final List<Grade> grades;

    public Profile(List<Grade> g) {

        boolean foundFail = false;

//        if (g == null){
//            throw new IllegalArgumentException();
//        }

        if (g != null && g.isEmpty() == false) {
            //Checks for any fail grade in the list of grades
            for (Grade grade : g) {
                if (grade.classify() == Classification.Fail) {
                    foundFail = true;
                }
            }
        }

//TODO  Additional exception added for list of grades that has less than 4 grades
//		Throws an exception when the list contain any fail grade, is null, or empty.
//      Otherwise assign the input list to the class variable of list with grades arguments inside
        if (g == null || g.isEmpty() || foundFail == true ) {
            throw new IllegalArgumentException();
        } else {
            grades = g;
        }


    }

    public Classification classify() {

        third = lowerSecond = upperSecond = first = 0;

        int gradesSize = grades.size();

        for (Grade grade : grades) {

            Classification gradeClass = grade.classify();

            switch (gradeClass) {
                case First:
                    first++;
                    break;
                case UpperSecond:
                    upperSecond++;
                    break;
                case LowerSecond:
                    lowerSecond++;
                    break;
                case Third:
                    third++;
                    break;
                default:
                    break;
            }
        }

        if (first != 0 && first >= 2) {
            return Classification.First;
        } else if ((first != 0 || upperSecond != 0) && first + upperSecond >= 2) {
            return Classification.UpperSecond;
        } else if (first + upperSecond + lowerSecond >= 2) {
            return Classification.LowerSecond;
        } else {
            return Classification.Third;
        }

    }

    public boolean isClear() {
// For first or upper second class it is a clear profile
// if the third class grades in the profile are no more than 25% of the total.
// Second and Third always clear. Otherwise is borderline hence return false

        if (this.classify() == Classification.Third || this.classify() == Classification.LowerSecond) {
            return true;
        } else if (this.classify() == Classification.First && third <= 1) {
            return true;
        } else if (this.classify() == Classification.UpperSecond && third <= 1) {
            return true;
        } else {
            return false;
        }
    }


}
