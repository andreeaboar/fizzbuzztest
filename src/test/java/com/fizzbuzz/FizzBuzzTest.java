package com.fizzbuzz;

import com.fizzbuzz.FizzBuzzUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class FizzBuzzTest {
    @Test
    public void doNotConvertIfNormal() {
        Assert.assertEquals("1", FizzBuzzUtil.convert(1));
        Assert.assertEquals("2", FizzBuzzUtil.convert(2));
    }

    @Test
    public void convertToFizzIfMultipleOfThree() {
        Assert.assertEquals("fizz", FizzBuzzUtil.convert(12));
    }

    @Test
    public void convertToBuzzIfMultipleOfFive() {
        Assert.assertEquals("buzz", FizzBuzzUtil.convert(5));
    }

    @Test
    public void convertToFizzBuzzIfMultipleOfThreeAndFive() {
        Assert.assertEquals("fizzbuzz", FizzBuzzUtil.convert(15));
    }

    @Test
    public void convertToAlfrescoIfContainsThree() {
        Assert.assertEquals("alfresco", FizzBuzzUtil.convert(3));
    }

    @Test
    public void countInteger() {
        Map<String, Long> report = getReport();
        Long expected = 10L;
        Assert.assertEquals(expected, report.get("integer"));
    }

    @Test
    public void countFizz() {
        Map<String, Long> report = getReport();
        Long expected = 4L;
        Assert.assertEquals(expected, report.get("fizz"));
    }

    @Test
    public void countBuzz() {
        Map<String, Long> report = getReport();
        Long expected = 3L;
        Assert.assertEquals(expected, report.get("buzz"));
    }

    @Test
    public void countFizzBuzz() {
        Map<String, Long> report = getReport();
        Long expected = 1L;
        Assert.assertEquals(expected, report.get("fizzbuzz"));
    }

    @Test
    public void countAlfresco() {
        Map<String, Long> report = getReport();
        Long expected = 2L;
        Assert.assertEquals(expected, report.get("alfresco"));
    }

    private static Map<String, Long> getReport() {
        int n = 20;
        List<String> fizzBuzz = FizzBuzzUtil.createFizzBuzzList(n);
        Map<String, Long> report = FizzBuzzUtil.createReport(fizzBuzz);
        return report;
    }
}