package conversion.numeros;

public class ArabicRomanNumerals {
    public static String convert(int i) {
        if (i == 10) return "X";
        return "I".repeat(i);
    }
}
