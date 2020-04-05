import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {
    @Test
    public void doNotConvertIfNormal() {
        Assert.assertEquals("1", FizzBuzzUtil.convert(1));
        Assert.assertEquals("2", FizzBuzzUtil.convert(2));
    }

    @Test
    public void convertToFizzIfMultipleOf3() {
        Assert.assertEquals("fizz", FizzBuzzUtil.convert(12));
    }

    @Test
    public void convertToBuzzIfMultipleOf5() {
        Assert.assertEquals("buzz", FizzBuzzUtil.convert(5));
    }

    @Test
    public void convertToFizzBuzzIfMultipleOf3And5() {
        Assert.assertEquals("fizzbuzz", FizzBuzzUtil.convert(15));
    }

    @Test
    public void createFizzBuzzListFrom1ToGivenN() {
        int n = 20;
        List<String> expectedFizzBuzzList = new ArrayList<>(List.of("1", "2", "alfresco", "4", "buzz", "fizz", "7", "8", "fizz",
                "buzz", "11", "fizz", "alfresco", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"));
        Assert.assertEquals(expectedFizzBuzzList, FizzBuzzUtil.createFizzBuzzList(n));
    }

    @Test
    public void convertToAlfrescoIfContains3() {
        Assert.assertEquals("alfresco", FizzBuzzUtil.convert(3));
    }
}