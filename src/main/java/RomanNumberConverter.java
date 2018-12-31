public class RomanNumberConverter {

    private enum ROMAN_NUMERAL {
        M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);

        private int value;

        ROMAN_NUMERAL(int value) {
            this.value = value;
        }
    }
    public String convert(int number) {
        String romanNumber = "";
        for( var romanNumeral: ROMAN_NUMERAL.values())
            for (;number/romanNumeral.value > 0;number -= romanNumeral.value)
                romanNumber += romanNumeral.name();
        return romanNumber;
    }
}
