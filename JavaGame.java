import java.util.Scanner;

import java.util.Random;

public class JavaGame
{
    public static void main (String []args)
   {
         Scanner in = new Scanner (System.in);
         Random rand = new Random();

         int rn = rand.nextInt(100) + 1;
         //System.out.println(rn);

         int chances = 10;




         while (chances > 0)
         {
          System.out.println("Enter your guess beyween 0 to 100 ");
          int pg = in.nextInt();

          if (pg == rn)
          {
            System.out.println("Correct guess :)");
            break;
          }
          else if (pg < rn)
          {
            System.out.println("The Random number is greater the your guess");
            chances -- ;
          }  
          else 
          {
            System.out.println("The Random number is smaller than your guess");
            chances -- ;
          }
         }






         if (chances == 0)
         {
            System.out.println("Game OoOver :(");
         }

    }
}
