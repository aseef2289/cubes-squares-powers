/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 12, 2021
* Description:
* This is a program completes math functions 
* It takes user input 
* It can find the square of a number
* It can find the cube of a number 
* It can find the value of a number to any power
* It is text based
* Uses for loops and while loops
*/

//needed to get user input via keyboard
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //variable declaration and initializing
    //Scanner is called keyedInput and initliazed once
    Scanner keyedInput = new Scanner(System.in);

    //integer for choice starts at zero
    //used to store user's choice
    int choice = 0;
    //stores value user wants squared
    int squareVal;
    //stores value user wants cubed
    int cubeVal;

    //stores base value user inputs
    int baseVal;
    //stores power value user inputs
    int powerVal;
    //result value used in for loop
    int resultVal = 1;

    //the while loop ends when user choses 4 for quit
    while (choice !=4)
    {
      //Prints options for user
      System.out.println("---Aseef's Math Program---");
      System.out.println("");
      System.out.println("Please enter your choice:");
      System.out.println("1... Find the value of a number squared");
      System.out.println("2... Find the value of a number cubed");
      System.out.println("3... Find the value of a number, to any power");
      System.out.println("4... Exit");
      //Asks user to pick an option
      System.out.println("Please enter your choice:");
      System.out.println("");
      System.out.println("----------------------------");
      //stores user choice as an integer
      choice = keyedInput.nextInt();

      //Actions if user picks 1
      if (choice == 1)
      {
        //User's number is squared
        System.out.println("You have chosen to square a number");
        //Asks user for the number they want squared
        System.out.println("Enter the number you would like to square");
        //Stores user's number they want to square
        squareVal = keyedInput.nextInt();
        //Prints user's number squared
        System.out.println(squareVal*squareVal);
      }
      //Actions if user picks 2
      else if (choice == 2)
      {
        //User's number is cubed
        System.out.println("You have chosen to cube a number");
        //Asks user for the number they want cubed
        System.out.println("Enter the number you would like to cube");
        //Stores user's number they want to cube 
        cubeVal = keyedInput.nextInt();
        //Prints user's number cubed
        System.out.println(cubeVal*cubeVal*cubeVal);
      }
      //Actions if user picks 3
      else if (choice == 3)
      {
        //Rasies user's number to any power
        System.out.println("You have chosen to find the value of a number, to any power");
        //Asks user for base value
        System.out.println("Enter the base number you would like to use");
        //Stores user's base value
        baseVal = keyedInput.nextInt();
        //Asks user for 
        System.out.println("Enter the power number you would like to use");
        //Stores user's power value
        powerVal = keyedInput.nextInt();
        /*
        * For loop runs until false
        * baseValue is multiplied until i is greater than 
        * the powerValue
        * Stores result in resultValue
        */
        for (int i = 1; i <= powerVal; i++)
        {
          resultVal = resultVal * baseVal;
        }
        //Prints resultValue
        System.out.println(resultVal);
      }
    }
    //Goodbye message if user quits program
    System.out.println("Goodbye!");
    //closes user input via keyboard
    keyedInput.close();
  }//end of main method
}//end of class method