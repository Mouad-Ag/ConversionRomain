package conversion.numeros;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        String result = "";
        if (i >= 40) {
            result += "XL";
            i -= 40;
        }
        if (i >= 10) {
            result += "X".repeat(i / 10);
            i %= 10;
        }
        if (i == 9) {
            return result + "IX";
        }
        if (i >= 5) {
            result += "V";
            i -= 5;
        }
        if (i == 4) {
            return result + "IV";
        }
        return result + "I".repeat(i);
    }
}
