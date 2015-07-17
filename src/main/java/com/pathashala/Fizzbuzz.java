package com.pathashala;

public class Fizzbuzz {
    //  private int value;
    public String IsFizzBuzzBlab(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        } else {
            System.out.println("Blab");

        }
        return "Blab";
    }

}