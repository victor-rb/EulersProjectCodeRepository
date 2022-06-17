package euler_project.problems;
import static euler_project.Utility.isMultiple;

public class ProblemOne {

    private final int CEILING = 1000;

    public ProblemOne(){


        int result = 0;

        for(int i = 3; i < CEILING;i++){

            if(isMultiple(3,i) ||
                    isMultiple(5,i)) result += i;

        }

        System.out.println(result);

    }



}
