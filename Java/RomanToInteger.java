import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i + 1 == s.length()) {
                result += romanMap.get(s.charAt(i));
                continue;
            }
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] testCases = { "III", "IV", "IX", "LVIII", "MCMXCIV" };
        for (String roman : testCases) {
            System.out.println("Roman numeral: " + roman + " -> Integer: " + romanToInt(roman));
        }
    }
}