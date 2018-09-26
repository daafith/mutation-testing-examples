<?php
include 'src/calculator.php';
use PHPUnit\Framework\TestCase;

class CalculatorTest extends TestCase
{
    public function test_should_return_the_squareroot_of_a_positive_number()
    {
        $actual = Calculator::squareRoot(16.0);
        $this->assertEquals(4, $actual);
    }

    public function test_should_return_the_squareroot_of_zero()
    {
        $actual = Calculator::squareRoot(0.0);
        $this->assertEquals(0, $actual);
    }

    public function test_should_throw_error_on_negative_number()
    {
        $this->expectException(\Exception::class);
        Calculator::squareRoot(-1.0);
        $this->fail('Expected error on negative number was not thrown');
    }
}
?>