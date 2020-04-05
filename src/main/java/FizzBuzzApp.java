import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = FizzBuzzUtil.createFizzBuzzList(n);
        Map<String, Long> report = FizzBuzzUtil.createReport(list);
        printOutput(list, report);
    }

    public static void printOutput(List<String> list, Map<String, Long> report) {
        FizzBuzzUtil.printFizzBuzz(list);
        System.out.println("\n");
        FizzBuzzUtil.printReport(report);
    }
}
