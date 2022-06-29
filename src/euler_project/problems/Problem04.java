package euler_project.problems;

import euler_project.Utility;

import static euler_project.Utility.isPalindrome;
import static java.lang.Math.max;

public class Problem04 {


    public Problem04() {

        int FLOOR = 100;
        int CEILING = 999;

        long highestPalindrome = 0;

        for(int i = FLOOR; i <= CEILING; i++){
            for(int j = i; j <= CEILING; j++){
                if(isPalindrome((long) i * j)){
                    highestPalindrome = max(highestPalindrome, ((long) i * j));
                }
            }
        }
        System.out.println(highestPalindrome);
    }





}
