package com.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApp {

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApp.class, args);
    }

}

//public class com.fizzbuzz.FizzBuzzApp {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<String> list = com.fizzbuzz.FizzBuzzUtil.createFizzBuzzList(n);
//        Map<String, Long> report = com.fizzbuzz.FizzBuzzUtil.createReport(list);
//        printOutput(list, report);
//    }
//
//
//    public static void printOutput(List<String> list, Map<String, Long> report) {
//        com.fizzbuzz.FizzBuzzUtil.printFizzBuzz(list);
//        System.out.println("\n");
//        com.fizzbuzz.FizzBuzzUtil.printReport(report);
//    }
//}
