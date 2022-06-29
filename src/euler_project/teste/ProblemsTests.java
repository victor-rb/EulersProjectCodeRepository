package euler_project.teste;

import euler_project.problems.Problem01;
import euler_project.problems.Problem03;
import euler_project.problems.Problem02;
import euler_project.problems.Problem04;
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

        new Problem01();

        assertEquals(
                "233168", outputStream
                .toString()
                .trim()
        );

    }

    @Test
    public void problemTwoTest(){

        new Problem02();

        assertEquals(
                "4613732",
                outputStream
                        .toString()
                        .trim()
        );

    }

    @Test
    public void problemThreeTest(){
        new Problem03();

        assertEquals("6857",
                outputStream
                        .toString()
                        .trim());
    }

    @Test
    public void problemFourTest(){
        new Problem04();

        assertEquals("906609",
                outputStream
                        .toString()
                        .trim());
    }

}
