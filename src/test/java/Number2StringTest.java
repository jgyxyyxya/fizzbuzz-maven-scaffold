import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Number2StringTest {

    @Tag("fizzbuzz")
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,fizz",
            "5,buzz",
            "15,fizzbuzz"
    })
    public void testFizzBuzz(int input, String output) {
        Number2String number2String = new Number2String();
        Assert.assertEquals(output, number2String.trans(input));
    }
}
