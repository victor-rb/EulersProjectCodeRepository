package euler_project.teste;

import org.junit.jupiter.api.Test;

import static euler_project.Utility.isEven;
import static euler_project.Utility.isMultiple;
import static euler_project.Utility.isPalindrome;
import static euler_project.Utility.isPrime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilityTest {

    @Test
    public void isMultipleTest(){

        boolean result = isMultiple(5, 15);

        assertTrue(result);

    }

    @Test
    public void isNotMultipleTest(){

        boolean result = isMultiple(5, 27);

        assertFalse(result);

    }

    @Test
    public void isEvenTest(){

        boolean result = isEven(10);

        assertTrue(result);

    }

    @Test
    public void isNotEvenTest(){

        boolean result = isEven(29);

        assertFalse(result);

    }


    @Test
    public void isPrimeTest(){

        boolean result = isPrime(97);

        assertTrue(result);

    }

    @Test
    public void isNotPrimeTest(){

        boolean result = isPrime(95);

        assertFalse(result);

    }

    @Test
    public void isPalindromeTest(){

        boolean result = isPalindrome(9009);

        assertTrue(result);

    }

    @Test
    public void isNotPalindromeTest(){

        boolean result = isPalindrome(84765);

        assertFalse(result);

    }

}
