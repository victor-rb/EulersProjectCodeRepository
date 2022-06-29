package euler_project.problems;

import euler_project.Utility;

public class Problem02 {

    final private int CEILING = 4000000;

    public Problem02(){

        int result = 0;
        int number1 = 0;
        int number2 = 1;
        int fib = 0;

        while(fib < CEILING){

            fib = number1 + number2;
            if(Utility.isEven(fib)) result += fib;
            number1 = number2;
            number2 = fib;

        }

        System.out.println(result);
    }

}
