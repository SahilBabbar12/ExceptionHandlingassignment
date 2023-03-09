package com.knoldus;
import java.util.Scanner;

//Custom exception to handle division by zero
class DivisionByZero extends Exception{
    DivisionByZero(String error){
        super(error);
    }
}
public class Calculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=0;
        int number2=0;
        //try-catch block for handling 'NumberFormatException'
        try{
            System.out.println("Enter the First Number");
            number1= Integer.parseInt(input.next());
            System.out.println("Enter the second number");
            number2= Integer.parseInt(input.next());
            System.out.println("sum  of 2 numbers= "+add(number1,number2));
            System.out.println("difference of 2 numbers ="+subtract(number1,number2));
            System.out.println("multiplication of 2 numbers= "+multiply(number1,number2));

            int result=divide(number1,number2);
            if(result!=-1)
            System.out.println("quotient of 2 numbers= "+result);
        }
        catch (NumberFormatException e){
            System.out.println("Input is not a valid number");
        }

    }
    public static  int  add(int number1,int number2){
        int sum=number1+number2;
        return sum;
    }
    public static  int  subtract(int number1,int number2){
        int difference=number1-number2;
        return difference;
    }
    public static  int  multiply(int number1,int number2){
        int multiply=number1 * number2;
        return multiply;
    }
    public static  int  divide(int number1,int number2) {
        int result =-1;
    //try-catch block to handle the division by zero exception
        try{
            if(number2==0){
                throw new DivisionByZero("Division by Zero is Not allowed");
            }
            else{
                result = number1/number2;
            }
        }
        catch (DivisionByZero ex){
            System.out.println(ex);
        }
        return result;
    }
}
