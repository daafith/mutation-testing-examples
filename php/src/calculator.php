<?php
class Calculator
{
    public static function squareRoot(float $input): float
    {
        if ($input < 0.0) 
        {
            throw new Exception('I only deal with positive numbers');
        }
        return sqrt($input);
    }
}
?>