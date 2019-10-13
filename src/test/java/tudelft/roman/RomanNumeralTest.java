package tudelft.roman;

import org.jetbrains.concurrency.PromiseManager;
import org.jetbrains.debugger.EvaluateResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
    @Test
     public void SingleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("X");
        Assertions.assertEquals(10, result);
    }
    @Test
       public void RomanWithManyDigit() {
    RomanNumeral roman= new RomanNumeral();
    int result = roman.convert(  "C");
    Assertions.assertEquals(100, result);

        }




}
