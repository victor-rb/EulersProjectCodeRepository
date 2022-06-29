package euler_project.problems;

import static euler_project.Utility.isPrime;

public class Problem03 {

    private final long CEILING_NUMBER = 600851475143L;

    public Problem03(){

        long greaterFactor = 0;

        for(long i = 3L; (i * i) < CEILING_NUMBER; i += 2){
            if(CEILING_NUMBER % i == 0 && isPrime(i)){
                if(greaterFactor < i){
                    greaterFactor = i;
                }
            }
        }
        System.out.println(greaterFactor);
    }
}
