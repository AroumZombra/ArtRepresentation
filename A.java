import java.util.Scanner;


    /**
     ---------------------------------------------------------------------

     I only used in this project println/print statements, static methods, method calls, loops, nested loops, local variables, and class constants.
    
     I do not use in this project method parameters, methods that return values, or 
     conditional statements (i.e., if, if/else statements).

    ---------------------------------------------------------------------
    */

 public class A {
    
    // Do NOT change the following line.
    public static int SIZE;

    public static void main(String[] args) {

        // Do NOT change the following two lines.
        if(args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);

        //---------------------------------------------------------------------
        // Fill in your code here
        String response;
        do{
        System.out.println("Please enter the size integer:");
        Scanner scan = new Scanner(System.in);
        SIZE = scan.nextInt();
       
        
        
        topline();  //displays the first ligne one the figure
        mediumHalf();//Loops the following ligne
        bottomline();//displays ...........~~~~~~~~~............
        bottomHalf();// displays |-#-#-|
        lastPart();   //displays the last part.
        System.out.println();
        
        System.out.println();

        System.out.println("Would you like to try another number? Enter yes to continue and any key to end:");
        //Scanner scan = new Scanner(System.in);
        response = scan.next();
  
        }
        while (response.equals( "yes")); 
        
    }

//The fisrt line methode
public static void topline()
{
    
        for(int dot = 1; dot <= 4*SIZE+2; dot++)//a for loop to display only dot(.)
        {
    System.out.print(".");
        }
    
    for(int a = 1; a <= 2*SIZE-1; a++)// a for loop to display @ sign
        {
        System.out.print("@");
        }
        for(int dot = 1; dot <= 4*SIZE+2; dot++)
        {
    System.out.print(".");
        }
        System.out.println();
       
}

//This method loops the second ligne.
//It is static, therefore it does not need to be instantiate
public static void mediumHalf()
{
    for(int line = 1; line <= SIZE*2+1; line++)// loops a new line
    {
        for(int dot = 1; dot <= 4*SIZE+2; dot++)
        {
    System.out.print(".");
        }
    
        for(int bar = 1; bar <= 2*SIZE-1; bar++)//display |
        {
        System.out.print("|");
        }
        for(int dot = 1; dot <= 4*SIZE+2; dot++)
        {
    System.out.print(".");
        }
        System.out.println();
    
    }
    topline();//topline will get call after every iteration
}

// This method will display |-#-#-| and call bottomline which will 
//display ..........~~~~~~~~~......... for each iteration.
public static void bottomHalf()
{
    for(int line = 1; line <= SIZE*SIZE-3; line++)
    {
    for(int dot = 1; dot <= 4*SIZE ; dot++)
    {
        System.out.print(".");
    }
    System.out.print("|");
    
    for(int sign = 1; sign <= SIZE; sign++)// for loop to display -#
    {
        System.out.print("-#");
        
    }
    System.out.print("-|");
    
    for(int dot = 1; dot <= 4*SIZE ; dot++)
    {
        System.out.print(".");
    }
    System.out.println();
    bottomline(); //This method will get called each iteration in this scope
}

}

//This method display .....~~~~~~~~~~~.........
public static void bottomline()
{

    for(int dot = 1; dot <= 4*SIZE ; dot++)
    {
        System.out.print(".");
    }
    
    for(int sign = 1; sign <= 2*SIZE + 3; sign++)//display ~~~~~~~~
    {
        System.out.print("~");
        
    }
    
    for(int dot = 1; dot <= 4*SIZE ; dot++)
    {
        System.out.print(".");
    }
    System.out.println();

}
    
//This method display the last part of the figure.
public static void lastPart()
{
    
    for(int line =1; line <= SIZE; line++)
    {
        
        
        System.out.print("/\"");
        for(int dot = 1; dot<=5*SIZE;dot++)
        {
        System.out.print("&\"");
        }
        System.out.print("\\");
        System.out.println();

    }

}

}



