package com.pathashala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {
    private Fizzbuzz fizzbuzz;

    @Test
    public void ShouldReturnFizzIFNumberMultipleOfThree()
    {
        fizzbuzz= new Fizzbuzz();
        String result=fizzbuzz.IsFizzBuzzBlab(6);
        assertEquals("Fizz",result);

    }

    @Test
    public void ShouldReturnBuzzIFNumberMultipleOfFive()
    {
        fizzbuzz= new Fizzbuzz();
        String result=fizzbuzz.IsFizzBuzzBlab(10);
        assertEquals("Buzz",result);

    }


}