import java.lang.reflect.GenericDeclaration;

public class Grade {

    private final int points;

    public int getPoints() {

        return points;
    }

    public Grade(int p) throws IllegalArgumentException {
        if (p < 1 || p > 20) {
            throw new IllegalArgumentException();
        } else {
            points = p;
        }
    }

    // Your additions/changes below this line


    public static Grade fromPercentage(int input) throws IllegalArgumentException {

        Grade grade;

        if (input == -1) {

            grade = new Grade(20);
            return grade;
        } else if (input < 0 && input > 100) {

            throw new IllegalArgumentException();

        } else if (input >= 79 && input <= 100) {

            grade = new Grade(1);
            return grade;

        } else if (input >= 76 && input <= 78) {

            grade = new Grade(2);
            return grade;

        } else if (input >= 73 && input <= 75) {

            grade = new Grade(3);
            return grade;
        } else if (input >= 70 && input <= 72) {

            grade = new Grade(4);
            return grade;
        } else if (input >= 67 && input <= 69) {

            grade = new Grade(5);
            return grade;
        } else if (input >= 65 && input <= 66) {

            grade = new Grade(6);
            return grade;
        } else if (input >= 62 && input <= 64) {

            grade = new Grade(7);
            return grade;
        } else if (input >= 60 && input <= 61) {

            grade = new Grade(8);
            return grade;
        } else if (input >= 57 && input <= 59) {

            grade = new Grade(9);
            return grade;
        } else if (input >= 55 && input <= 56) {

            grade = new Grade(10);
            return grade;
        } else if (input >= 52 && input <= 54) {

            grade = new Grade(11);
            return grade;
        } else if (input >= 50 && input <= 51) {

            grade = new Grade(12);
            return grade;
        } else if (input >= 47 && input <= 49) {

            grade = new Grade(13);
            return grade;
        } else if (input >= 45 && input <= 46) {

            grade = new Grade(14);
            return grade;
        } else if (input >= 42 && input <= 44) {

            grade = new Grade(15);
            return grade;
        } else if (input >= 40 && input <= 41) {

            grade = new Grade(16);
            return grade;
        } else if (input >= 35 && input <= 39) {

            grade = new Grade(17);
            return grade;
        } else if (input >= 30 && input <= 34) {

            grade = new Grade(18);
            return grade;
        } else if (input >= 0 && input <= 29) {

            grade = new Grade(19);
            return grade;
        } else {

            grade = new Grade(20);
        }

        return grade;
    }


    public Classification classify() {
//        Returns the Classification of the current grade object

        if (points >= 1 && points <= 4) {

            return Classification.First;

        } else if (points >= 5 && points <= 8) {

            return Classification.UpperSecond;

        } else if (points >= 9 && points <= 12) {

            return Classification.LowerSecond;

        } else if (points >= 13 && points <= 16) {

            return Classification.Third;

        } else {

            return Classification.Fail;
        }
    }

}


//TODO implement non-participation return/ Confirm