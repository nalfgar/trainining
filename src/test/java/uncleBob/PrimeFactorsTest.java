package uncleBob;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static uncleBob.PrimeFactors.generate;

class PrimeFactorsTest {

    private List<Integer> list(int...ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    @Test
    void testOne(){
        assertEquals(list(), generate(1));
    }

    @Test
    void testTwo(){
        assertEquals(list(2), generate(2));
    }

    @Test
    void testThree(){
        assertEquals(list(3), generate(3));
    }

    @Test
    void testFour(){
        assertEquals(list(2,2), generate(4));
    }

    @Test
    void testSix(){
        assertEquals(list(2,3), generate(6));
    }

    @Test
    void testEight(){
        assertEquals(list(2,2,2), generate(8));
    }

    @Test
    void testNine(){
        assertEquals(list(3,3), generate(9));
    }
}
