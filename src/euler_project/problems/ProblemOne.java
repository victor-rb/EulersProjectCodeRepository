package euler_project.problems;
import static euler_project.Utility.isMultiple;

public class ProblemOne {

    public ProblemOne(){
        int MAXNATURALNUMBER = 1000;

        int result = 0;

        for(int i = 3; i < MAXNATURALNUMBER;i++){

            if(isMultiple(3,i) ||
                    isMultiple(5,i)) result += i;

        }

        System.out.println(result);

    }



}
