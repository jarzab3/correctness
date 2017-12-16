import java.util.List;

public class Degree {
    // Your additions/changes below this line

    private final List<Grade> year2Grades;
    private final List<Grade> year3Grades;

    public Degree(List<Grade> year2, List<Grade> year3) {

        boolean foundFail = false;
        int year2Size;
        int year3Size;

        if (year2 != null || year3 != null) {
            //Checks for any fail grade in the lists of grades for both years
            for (Grade grade : year2) {
                if (grade.classify() == Classification.Fail) {
                    foundFail = true;
                }
            }

            for (Grade grade : year3) {
                if (grade.classify() == Classification.Fail) {
                    foundFail = true;
                }
            }
            year2Size = year2.size();
            year3Size = year3.size();

        }else {
            year2Size = 0;
            year3Size = 0;
        }


//      Throws an exception when the list contain any fail grade, is null, or does not contains 4 degrees
//      Otherwise assign the input list to the class variable of list with grades arguments inside
            if (year2 == null || year3 == null ||  foundFail == true || year2Size < 4 || year3Size < 4) {
                throw new IllegalArgumentException();
            } else {
                year2Grades = year2;
                year3Grades = year3;
            }
    }

    public Classification classify() {

        Profile Profile5 = new Profile(year2Grades);
        Profile Profile6 = new Profile(year3Grades);

        int profile5Value;
        int profile6Value;

        if (Profile5.classify() == Classification.First){
            profile5Value = 5;
        }else if (Profile5.classify() == Classification.UpperSecond){
            profile5Value = 4;
        }else if (Profile5.classify() == Classification.LowerSecond){
            profile5Value = 3;
        } else if (Profile5.classify() == Classification.Third){
            profile5Value = 2;
        }else{
            profile5Value = 1;
        }

        if (Profile6.classify() == Classification.First){
            profile6Value = 5;
        }else if (Profile6.classify() == Classification.UpperSecond){
            profile6Value = 4;
        }else if (Profile6.classify() == Classification.LowerSecond){
            profile6Value = 3;
        } else if (Profile6.classify() == Classification.Third){
            profile6Value = 2;
        }else {
            profile6Value = 1;
        }

        if (Math.abs(profile6Value - profile5Value) > 2 ){
            return Classification.Discretion;
        }else if (Math.abs(profile5Value - profile6Value) > 2){
            return Classification.Discretion;
        }


        if (Profile5.classify() == Profile6.classify()){
            return Profile6.classify();
        }else if (profile6Value > profile5Value){
            return Classification.values()[profile6Value];
        }else if (profile5Value > profile6Value){
            return Classification.values()[profile5Value];
        }else {
            return Classification.Discretion;
        }


    }
}
