package conversion.numeros;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {
    @Test
    public void testConvertOne() {
        assertEquals("I", ArabicRomanNumerals.convert(1));
    }
    @Test
    public void testConvertTwo() {
        assertEquals("II", ArabicRomanNumerals.convert(2));
    }
    @Test
    public void testConvertThree() {
        assertEquals("III", ArabicRomanNumerals.convert(3));
    }
    @Test
    public void testConvertTen() {
        assertEquals("X", ArabicRomanNumerals.convert(10));
    }
    @Test
    public void testConvertTwenty() {
        assertEquals("XX", ArabicRomanNumerals.convert(20));
    }
    @Test
    public void testConvertThirty() {
        assertEquals("XXX", ArabicRomanNumerals.convert(30));
    }
    @Test
    public void testConvertEleven() {
        assertEquals("XI", ArabicRomanNumerals.convert(11));
    }

}
