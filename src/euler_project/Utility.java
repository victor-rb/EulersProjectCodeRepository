package euler_project;

public class Utility {

    public static boolean isMultiple(int factor, int number){

        return number % factor == 0;

    }

    public static boolean isEven(int number){

        return number % 2 == 0;

    }

    public static boolean isPrime(long number){

        for(long i = 2; (i * i) < number; i += 1){

            if (number % i == 0){

                return false;

            }
        }

        return true;

    }

    public static boolean isPalindrome(long number){

        String value = String.valueOf(number);
        String reversedValue = new StringBuilder(value).reverse().toString();

        return value.equals(reversedValue);

    }

}
