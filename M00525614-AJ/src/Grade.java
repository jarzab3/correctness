import java.lang.reflect.GenericDeclaration;

public class Grade {
    private final int points;

    public int getPoints() {
        return points;
    }

    public Grade(int p) throws IllegalArgumentException {
        if (p < 1 || p > 20)
            throw new IllegalArgumentException();
        points = p;
    }

    // Your additions/changes below this line
    public Classification classify() {

        return Classification.Fail;

    }

    public static Grade fromPercentage(int input) throws IllegalArgumentException {

        if (input == -1 ) {

            Grade nonParticipation = new Grade(20);
            return nonParticipation;

        } else if (!(input < 0) || !(input > 100)) {

            throw new IllegalArgumentException();

        }

        Grade instance = new Grade(input);

        return instance;
    }
}


//TODO implement non-participation return/ Confirm