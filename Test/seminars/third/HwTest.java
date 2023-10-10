package seminars.third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HwTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void testIsEvenReturnsTrueForEvenNumber() {

        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void testIsEvenReturnsFalseForOddNumber() {

        assertFalse(mainHW.evenOddNumber(3));
    }

    @Test
    void testIsNumberInRangeReturnsTrueForNumberInRange() {

        assertTrue(mainHW.numberInInterval(50));
        assertTrue(mainHW.numberInInterval(26));
        assertTrue(mainHW.numberInInterval(99));
    }

    @Test
    void testIsNumberInRangeReturnsFalseForNumberOutOfRange() {

        assertFalse(mainHW.numberInInterval(10));
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
    }
}

