//                                  SIMPLE CALCULATOR
//      Task-2 solution for C++ PROGRAMMING (using JAVA language)


import java.util.Scanner;
class Task_5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1= sc.nextDouble();
        System.out.print("Enter num2: ");
        double num2= sc.nextDouble();
        System.out.println("Choose operation to perform: ");
        boolean input= false;
        while(!input)
        {
            System.out.print("Press: '+' for addition,    '-' for subtraction,   '*' for multiplication,  '/' for division: ");
            char op= sc.next().charAt(0);
            switch(op)
            {
                case '+':
                {
                    input= true;
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    break;
                }
                case '-':
                {
                    input= true;
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    break;
                }
                case '*':
                {
                    input= true;
                    System.out.println(num1+" x "+num2+" = "+(num1*num2));
                    break;
                }
                case '/':
                {
                    input= true;
                    if(num2==0)
                        System.out.println("Cannot divide by 0");
                    else
                        System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    break;
                }
                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }
}