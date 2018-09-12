package test;

import app.UnsophisticatedCalculator;
import org.junit.Assert;
import org.junit.Test;


public class UnsophisticatedCalculatorTest {

    @Test
    public void should_give_square_root() {
        Assert.assertEquals( 4, UnsophisticatedCalculator.squareRoot(16), 0.0);
    }

    @Test(expected = RuntimeException.class)
    public void throw_exception_when_outcome_is_not_a_real_number() {
        UnsophisticatedCalculator.squareRoot(-0.0);
    }

    @Test
    public void throw_exception_when_outcome_is_not_a_real_number3() {
        Assert.assertEquals(0, UnsophisticatedCalculator.squareRoot(0.0), 0.0);
    }

}
