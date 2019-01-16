package codingbat;

import org.junit.jupiter.api.Test;

import static codingbat.BuildSquare.buildSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildSquareTest {

    @Test
    void testOne(){
        assertEquals("", buildSquare(0));
    }

    @Test
    void testTwo(){
        assertEquals("+", buildSquare(1));
    }

    @Test
    void testThree(){
        assertEquals("++\n++", buildSquare(2));

    }

    @Test
    void testEight(){
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", buildSquare(8));

    }

}
