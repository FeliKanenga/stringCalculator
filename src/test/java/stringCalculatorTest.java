import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class stringCalculatorTest {
    @Test
    public void ifEmpty() throws Exception {
        Assert.assertEquals(stringCalculator.add(""),0);
    }
    @Test
    public void multipleInput() throws Exception {
        Assert.assertEquals(stringCalculator.add("1,2,3,4"),10);
    }
    @Test
    public void newLinesBetweenIntegers()throws Exception{
        Assert.assertEquals(stringCalculator.add("1\n2,3"),6);
    }
    @Test
    public void handleDifferentDelimiters() throws Exception{
        Assert.assertEquals(stringCalculator.add("//4\n142"),3);
    }

}