package euler_project.teste;

import euler_project.problems.ProblemOne;
import euler_project.problems.ProblemTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemsTests {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void problemOneTest(){

        new ProblemOne();

        assertEquals(
                "233168", outputStream
                .toString()
                .trim()
        );

    }

    @Test
    public void problemTwoTest(){

        new ProblemTwo();

        assertEquals(
                "4613732", outputStream
                        .toString()
                        .trim()
        );

    }


}
