import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberConverterTest {

    private RomanNumberConverter converter;


    /**
     * 1 -> "I"
     * 6 -> "VI"
     * 1666 ->"MDCLXVI"
     * 2 -> "II"
     * 4 -> "IV"
     * 444 -> "CDXLIV"
     * 999 -> "CMXCIX"
     * 1984 -> "MCMLXXXIV"
     */

    @BeforeEach
    void setUp() {
        converter = new RomanNumberConverter();
    }


    @Test
    public void converts_single_numeral_number() {
        String romanNumber = converter.convert(1);
        assertEquals("I",romanNumber);
    }

    @Test
    public void converts_additive_numerals_number() {
        String romanNumber = converter.convert(6);
        assertEquals("VI",romanNumber);
    }

    @Test
    public void converts_all_numerals_number() {
        String romanNumber = converter.convert(1666);
        assertEquals("MDCLXVI",romanNumber);
        romanNumber = converter.convert(444);
        assertEquals("CDXLIV",romanNumber);
        romanNumber = converter.convert(999);
        assertEquals("CMXCIX",romanNumber);
    }

    @Test
    public void converts_multiple_identical_numerals_number() {
        String romanNumber = converter.convert(2);
        assertEquals("II",romanNumber);
    }

    @Test
    public void converts_substractive_numerals_number() {
        String romanNumber = converter.convert(4);
        assertEquals("IV",romanNumber);
    }

    @Test
    public void converts_complex_number() {
        String romanNumber = converter.convert(1984);
        assertEquals("MCMLXXXIV",romanNumber);
    }
}
