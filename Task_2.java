//                            STUDENT GRADE CALCULATOR
//      Task-2 solution for JAVA DEVELOPMENT (using JAVA language)

import java.util.Scanner;
class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of resp subjects (out of 100)");
        System.out.print("Subject A: ");
        double s1= sc.nextDouble();
        System.out.print("Subject B: ");
        double s2= sc.nextDouble();
        System.out.print("Subject C: ");
        double s3= sc.nextDouble();
        System.out.println();
        while(true)
        {
            if(s1<0 || s1>100)
            {
                System.out.print("Enter valid number for Subject A: ");
                s1= sc.nextDouble();
                System.out.println();
                continue;
            }
            if(s2<0 || s2>100)
            {
                System.out.print("Enter valid number for Subject B: ");
                s2= sc.nextDouble();
                System.out.println();
                continue;
            }
            if(s3<0 || s3>100)
            {
                System.out.print("Enter valid number for Subject C: ");
                s3= sc.nextDouble();
                System.out.println();
            }
            else break;
        }
        double total= s1+s2+s3;
        System.out.println("Total Marks: "+total+"/300");
        double s1P= (s1*100)/100;
        double s2P= (s2*100)/100;
        double s3P= (s3*100)/100;
        double avgP= (s1P+s2P+s3P)/3;
        System.out.println("Average Percentage: "+avgP+"%");
        if(avgP>95)
            System.out.println("Grade 'O', Outstanding!!");
        else if(avgP>90)
            System.out.println("Grade 'A', Excellent!!");
        else if(avgP>80)
            System.out.println("Grade 'B', Good Job!!");
        else if(avgP>70)
            System.out.println("Grade 'C', Can do better!!");
        else if(avgP>60)
            System.out.println("Grade 'D', Improvement required!!");
        else
            System.out.println("'Fail', Better luck next time.");
    }
}