package conversion.numeros;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        String result = "";
        if (i >= 10) {
            result += "X".repeat(i / 10);
            i %= 10;
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
