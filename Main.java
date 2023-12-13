import java.util.Scanner;

public class Main extends Functions
{
    //instnace variables
    private static boolean condition;
    //constructor
    public Main()
    {

    }

    //main
    public static void main(String[] args)
    {
        //first number
        Scanner numberOne = new Scanner(System.in);
        System.out.println("What is your first number? ");

        int firstNumber = numberOne.nextInt();  // Read user input

        //second number
        Scanner numberTwo = new Scanner(System.in);
        System.out.println("What is your second number? ");

        int secondNumber = numberTwo.nextInt();  // Read user input


        //function choice
        Scanner function = new Scanner(System.in);
        System.out.println("Pick a function: ");
        System.out.println("[1]: add");
        System.out.println("[2]: substract");
        System.out.println("[3]: multiply");
        System.out.println("[4]: divide");

        Functions calculator = new Functions();

        int functionChoice = function.nextInt();  // Read user input

     
     //Calculations//
       if (functionChoice == 1)
       {
            calculator.add(firstNumber, secondNumber);

       } else if (functionChoice == 2)
       {
            calculator.subtract(firstNumber, secondNumber);

       } else if (functionChoice == 3)
       {
            calculator.multiply(firstNumber, secondNumber);
            

       } else if (functionChoice == 4)
       {
            calculator.divide(firstNumber, secondNumber);


       } else 
       {
           
            System.out.println("PROGRAM STOPPED");
                
            
       } 
       
       

    }

   
}