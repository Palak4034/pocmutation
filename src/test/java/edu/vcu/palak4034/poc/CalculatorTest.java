package edu.vcu.palak4034.poc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test// test Cond1 // in the same month
    public void testCalculator1() {
        //Calculator cal = new Calculator();
        assertEquals(2,cal.Calculator(1,25,1,27,2018));

    }

    @Test // Test Cond2 // not in the same month //start with days in the two months
    public void testCalculator2() {
        //Calculator cal = new Calculator();
        assertEquals(28,cal.Calculator(2,25,3,25,2018));

    }
    @Test // Test Cond2 // not in the same month //leap year
    public void testCalculator3() {

        assertEquals(29,cal.Calculator(2,25,3,25,2000));
    }

    @Test
    public void testCaclulator4() {
        assertEquals(364, cal.Calculator(1,1, 12, 31, 2017));
    }

    @Test
    public void testCaclulator5() {
        assertEquals(365, cal.Calculator(1,1, 12, 31, 2016));
    }

    @Test
    public void testCaclulator6() {
        assertEquals(364, cal.Calculator(1,1, 12, 31, 1900));
    }
}
