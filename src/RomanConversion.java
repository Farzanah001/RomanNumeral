import java.util.HashMap;
import java.util.Scanner;

public class RomanConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Roman Numeral: ");
        String roman = s.next();
//        if(roman=="I")
//            return 1;
//        if(roman=="V")
//            return 5;
//        if(roman=="X")
//            return 10;
//        if(roman=="L")
//            return 50;
//        if(roman=="C")
//            return 100;
//        if(roman=="D")
//            return 500;
//        if(roman=="M")
//            return 1000;
        HashMap<String, Integer> RomanValue = new HashMap<>();
        RomanValue.put("I", 1);
        RomanValue.put("V", 5);
        RomanValue.put("X", 10);
        RomanValue.put("L", 50);
        RomanValue.put("C", 100);
        RomanValue.put("D", 500);
        RomanValue.put("M", 1000);
        char ch;
        int result = RomanValue.get(roman.charAt(roman.length() - 1));

        for (int i = roman.length() - 2; i >= 0; i--) {

            if (RomanValue.get(roman.charAt(i)) >= RomanValue.get(roman.charAt(i + 1))) {
                result += RomanValue.get(roman.charAt(i));
            } else {
                result -= RomanValue.get(roman.charAt(i));
            }

        }

        System.out.println("The Integer Value for "+roman+" is "+result);
    }
}
