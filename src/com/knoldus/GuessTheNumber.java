package com.knoldus;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // recursive function that takes input from user and compares with the random number.
    public  static boolean checkNumber(int random_number) {

        Scanner input = new Scanner(System.in);
        int number=0;
        try{
            System.out.println("please enter a number");
            number = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Input Please enter a number");
            checkNumber(random_number);

        }

        if (number < random_number) {
            System.out.println("Too Low!! please enter the number again");
            return checkNumber(random_number);

        }
        else if (number > random_number) {
            System.out.println("Too High!! please enter the number again");
            return checkNumber(random_number);
        }
        return true;
    }
    public static void main(String[] args){
        int min = 1;
        int max = 100;
        Random random = new Random();
        int random_number = random.nextInt(100) + 1; // generating random number
        boolean isNumberFound=checkNumber(random_number);
        if(isNumberFound)
            System.out.println("You guessed it");

    }
}
