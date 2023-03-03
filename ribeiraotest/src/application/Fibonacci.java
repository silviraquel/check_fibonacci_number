package application;

import java.util.Scanner;
 
public class Fibonacci 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("TYPE A POSITIVE NUMBER: ");
         
        int input = sc.nextInt();
         
        int firstNum = 0;
         
        int secondNum = 1;
         
        int thirdNum = 0;
         
        while (thirdNum < input)
        {
            thirdNum = firstNum + secondNum;
             
            firstNum = secondNum;
             
            secondNum = thirdNum;
        }
         
        if(thirdNum == input)
        {
            System.out.println("This is Fibonacci number! ");
        }
        else
        {
            System.out.println("Sorry! This is not a Fibonacci number :-( ");
        }
        
        sc.close();
    }   
}


