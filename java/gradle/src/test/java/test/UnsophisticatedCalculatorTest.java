package test;

import app.UnsophisticatedCalculator;
import org.junit.Assert;
import org.junit.Test;


public class UnsophisticatedCalculatorTest {

    @Test
    public void should_give_square_root_of_positive_number() {
        Assert.assertEquals( 4, UnsophisticatedCalculator.squareRoot(16), 0.0);
    }

    @Test(expected = RuntimeException.class)
    public void throw_exception_when_outcome_is_not_a_rational_number() {
        UnsophisticatedCalculator.squareRoot(-1.0);
    }

    @Test
    public void should_give_square_root_of_zero() {
        Assert.assertEquals(0, UnsophisticatedCalculator.squareRoot(0.0), 0.0);
    }

}
