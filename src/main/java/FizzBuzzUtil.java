import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUtil {
    public static String convert(int numberToConvert) {
        if(numberToConvert % 15 == 0) return "fizzbuzz";
        if(numberToConvert % 3 == 0) return "fizz";
        if(numberToConvert % 5 == 0) return "buzz";
        return String.valueOf(numberToConvert);
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
