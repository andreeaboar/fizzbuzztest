import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUtil {
    public static String convert(int numberToConvert) {
        if(isAlfresco(numberToConvert)) return "alfresco";
        if(numberToConvert % 15 == 0) return "fizzbuzz";
        if(numberToConvert % 3 == 0) return "fizz";
        if(numberToConvert % 5 == 0) return "buzz";
        return String.valueOf(numberToConvert);
    }

    private static boolean isAlfresco(int n) {
        while(n != 0) {
            if(n % 10 == 3) return true;
            n = n / 10;
        }
        return false;
    }

    public static List<String> createFizzBuzzList(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            fizzBuzz.add(convert(i));
        }
        return fizzBuzz;
    }
    public static void printFizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(convert(i) + " ");
        }
    }
}
