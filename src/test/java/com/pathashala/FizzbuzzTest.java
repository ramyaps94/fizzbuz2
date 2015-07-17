package com.pathashala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {
    private Fizzbuzz fizzbuzz;

    @Test
    public void ShouldReturnTrueIFNumberMultipleOfThree()
    {
        fizzbuzz= new Fizzbuzz();
        boolean result=fizzbuzz.IsNumberMultipleOfThree(6);
        assertEquals(true,result);

    }


}