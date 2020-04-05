package com.fizzbuzz;

import java.util.*;

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

    public static void printFizzBuzz(List<String> fizzBuzz) {
        for(String el : fizzBuzz) {
            System.out.print(el + " ");
        }
    }

    public static Map<String, Long> createReport(List<String> fizzBuzz) {
        Map<String, Long> report = new HashMap<>();
        report.put("fizz", count(fizzBuzz, "fizz"));
        report.put("buzz", count(fizzBuzz, "buzz"));
        report.put("fizzbuzz", count(fizzBuzz, "fizzbuzz"));
        report.put("alfresco", count(fizzBuzz, "alfresco"));
        report.put("integer", count(fizzBuzz, "integer"));
        return report;
    }

    private static long count(List<String> fizzBuzz, String type) {
        if(type == "integer") {
            return fizzBuzz.stream()
                    .filter(el -> isInteger(el))
                    .count();
        }
        return Collections.frequency(fizzBuzz,type);
    }

    private static boolean isInteger(String el) {
        try {
            Integer.parseInt(el);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static void printReport(Map<String, Long> report) {
        for(String type: report.keySet()) {
            System.out.print(type + ": " + report.get(type) + " ");
        }
    }
}
