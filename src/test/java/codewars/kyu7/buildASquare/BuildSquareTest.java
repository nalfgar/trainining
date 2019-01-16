package codewars.kyu7.buildASquare;



import org.junit.jupiter.api.Test;

import static codewars.kyu7.buildASquare.BuildSquare.buildSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BuildSquareTest {

    @Test
    public static void testOne(){
        assertEquals("*", buildSquare(1) );

    }

}
