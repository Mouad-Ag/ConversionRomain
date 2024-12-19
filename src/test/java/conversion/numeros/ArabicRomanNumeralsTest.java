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
}
