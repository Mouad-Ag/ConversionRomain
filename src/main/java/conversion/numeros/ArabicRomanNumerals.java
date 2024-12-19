package conversion.numeros;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        String result = "";
        if (i >= 10) {
            result += "X".repeat(i / 10);
            i %= 10;
        }
        return result + "I".repeat(i);
    }
}
