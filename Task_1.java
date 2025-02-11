//                              INTEGER NUMBER GUESSING GAME
//      Task-1 solution for both JAVA DEVELOPMENT and C++ PROGRAMMING (using JAVA language)

import java.util.Scanner;
import java.util.Random;
class Task_1
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the origin number: ");
        int origin= sc.nextInt();
        System.out.print("Enter the terminating number: ");
        int terminate= sc.nextInt();
        if(origin>terminate)
        {
            int temp= origin;
            origin= terminate;
            terminate= temp;
        }
        System.out.println("Guess a number between '"+origin+"' and '"+terminate+"'");
        game(origin, terminate);
        while(true)
        {
            System.out.println();
            System.out.print("Press '1' to play again, '0' to exit: ");
            int press= sc.nextInt();
            System.out.println();
            if(press==1)
                game(origin, terminate);
            else if(press==0)
            {
                System.out.println("Thank-You!! Come back soon :)");
                break;
            }
            else
                System.out.println("Invalid input!!");
        }
    }

    public static void game(int o, int t)
    {
        int call1= settingRange(o, t);
        System.out.print("Guess the randomly generated number: ");
        int guess= sc.nextInt();
        int rounds= 4;
        while(rounds>=1)
        {
            if(call1==guess)
            {
                System.out.println("Correct Guess!!");
                break;
            }
            else
            {
                if(guess>call1)
                    System.out.println("Too high!!");
                else
                    System.out.println("Too low!!");

                call1= settingRange(o, t);
                System.out.print("Guess again: ");
                guess= sc.nextInt();
            }
            rounds--;
        }

        if(rounds==0)
        {
            System.out.println("You lose.. Score: "+rounds);
            System.out.println("    Game Over!!    ");
        }
        else
            System.out.println("Score: "+((rounds*100)+100)+" points");
    }
    public static int settingRange(int o, int t)
    {
        Random ra= new Random();
        return ra.nextInt(o,t+1);
    }
}