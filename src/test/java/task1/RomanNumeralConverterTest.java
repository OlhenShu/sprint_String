package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    private static final String PACKAGE = "task1.";

    public static boolean isMethodPresent(String typeName, String methodName, Class<?>[] parameterTypes, Class<?> parameterReturn) {
        try {
            Class<?> cls = Class.forName(typeName);
            return cls.getMethod(methodName, parameterTypes).getReturnType().equals(parameterReturn);
        } catch (Exception e) {
            return false;
        }
    }

    @Test
    @DisplayName("Check Negative")
    public void checkNegative() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.intToRoman(-1));
    }

    @Test
    @DisplayName("Check Zero")
    public void checkZero() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.intToRoman(0));
    }

    @Test
    @DisplayName("Check Over Maximum")
    public void checkOverMaximum() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.intToRoman(4000));
    }

    @Test
    @DisplayName("Check One")
    public void checkOne() {
        assertEquals("I", RomanNumeralConverter.intToRoman(1));
    }

    @Test
    @DisplayName("Check Maximum")
    public void checkMaximum() {
        assertEquals("MMMCMXCIX", RomanNumeralConverter.intToRoman(3999));
    }

    @Test
    @DisplayName("Check III")
    public void checkIII() {
        assertEquals("III", RomanNumeralConverter.intToRoman(3));
    }

    @Test
    @DisplayName("Check XXX")
    public void checkXXX() {
        assertEquals("XXX", RomanNumeralConverter.intToRoman(30));
    }

    @Test
    @DisplayName("Check CCC")
    public void checkCCC() {
        assertEquals("CCC", RomanNumeralConverter.intToRoman(300));
    }

    @Test
    @DisplayName("Check MMM")
    public void checkMMM() {
        assertEquals("MMM", RomanNumeralConverter.intToRoman(3000));
    }

    @Test
    @DisplayName("Check IV")
    public void checkIV() {
        assertEquals("IV", RomanNumeralConverter.intToRoman(4));
    }

    @Test
    @DisplayName("Check IX")
    public void checkIX() {
        assertEquals("IX", RomanNumeralConverter.intToRoman(9));
    }

    @Test
    @DisplayName("Check XL")
    public void checkXL() {
        assertEquals("XL", RomanNumeralConverter.intToRoman(40));
    }

    @Test
    @DisplayName("Check XC")
    public void checkXC() {
        assertEquals("XC", RomanNumeralConverter.intToRoman(90));
    }

    @Test
    @DisplayName("Check CD")
    public void checkCD() {
        assertEquals("CD", RomanNumeralConverter.intToRoman(400));
    }

    @Test
    @DisplayName("Check CM")
    public void checkCM() {
        assertEquals("CM", RomanNumeralConverter.intToRoman(900));
    }

    @Test
    @DisplayName("Check CCXXII")
    public void checkCCXXII() {
        assertEquals("CCXXII", RomanNumeralConverter.intToRoman(222));
    }

    @Test
    @DisplayName("Check CMXCIX")
    public void checkCMXCIX() {
        assertEquals("CMXCIX", RomanNumeralConverter.intToRoman(999));
    }
    @Test
    @DisplayName("Check 555")
    public void check555() {
        assertEquals("DLV", RomanNumeralConverter.intToRoman(555));
    }

    @Test
    @DisplayName("Check 1987")
    public void check1987() {
        assertEquals("MCMLXXXVII", RomanNumeralConverter.intToRoman(1987));
    }

    @Test
    @DisplayName("Check 2999")
    public void check2999() {
        assertEquals("MMCMXCIX", RomanNumeralConverter.intToRoman(2999));
    }

    @Test
    @DisplayName("Check 48")
    public void check48() {
        assertEquals("XLVIII", RomanNumeralConverter.intToRoman(48));
    }

    @Test
    @DisplayName("Check 344")
    public void check344() {
        assertEquals("CCCXLIV", RomanNumeralConverter.intToRoman(344));
    }

    @Test
    @DisplayName("Check 777")
    public void check777() {
        assertEquals("DCCLXXVII", RomanNumeralConverter.intToRoman(777));
    }

    @Test
    @DisplayName("Check 1234")
    public void check1234() {
        assertEquals("MCCXXXIV", RomanNumeralConverter.intToRoman(1234));
    }

    @Test
    @DisplayName("Check 2023")
    public void check2023() {
        assertEquals("MMXXIII", RomanNumeralConverter.intToRoman(2023));
    }

    @Test
    @DisplayName("Check 3847")
    public void check3847() {
        assertEquals("MMMDCCCXLVII", RomanNumeralConverter.intToRoman(3847));
    }

    @Test
    @DisplayName("Check 167")
    public void check167() {
        assertEquals("CLXVII", RomanNumeralConverter.intToRoman(167));
    }

    @Test
    @DisplayName("Check 2751")
    public void check2751() {
        assertEquals("MMDCCLI", RomanNumeralConverter.intToRoman(2751));
    }

    @Test
    @DisplayName("Check 3998")
    public void check3998() {
        assertEquals("MMMCMXCVIII", RomanNumeralConverter.intToRoman(3998));
    }

    @Test
    @DisplayName("Check random value within range")
    public void checkRandomValue() {
        assertEquals("MCDLXXXII", RomanNumeralConverter.intToRoman(1482));
        assertEquals("CDXLIV", RomanNumeralConverter.intToRoman(444));
        assertEquals("DCCCXC", RomanNumeralConverter.intToRoman(890));
    }
}
