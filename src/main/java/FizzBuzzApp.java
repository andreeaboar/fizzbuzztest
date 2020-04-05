import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        FizzBuzzUtil.printFizzBuzz(n);
    }
}
