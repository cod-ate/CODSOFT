//                                ATM INTERFACE
//      Task-3 solution for JAVA DEVELOPMENT (using JAVA language)

import java.util.Scanner;
class Task_3
{
    static int wd, dp, amtToWd, amtToD;
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        String name= sc.nextLine();
        System.out.print("Enter account no: ");
        int accNo= sc.nextInt();
        Bank bank= new Bank(name, accNo);
        bank.holder(name, accNo);
        Atm atm= new Atm(name, accNo);
        System.out.println("Current balance: "+Bank.balance+"rs.\n");
        System.out.println("       Press\n'1' to make withdrawal\n'2' to deposit\n'0' to exit");
        while(true)
        {
            System.out.print("Enter(0 / 1 / 2): ");
            int press= sc.nextInt();
            if(press==0)
            {
                System.out.println("Thank You "+bank.name.toUpperCase()+" :)");
                break;
            }
            else if(press==1)
            {
                System.out.print("Enter amount to withdraw: ");
                amtToWd= sc.nextInt();
                wd= atm.withdrawal(amtToWd);
                if(wd==-1)
                    System.out.println("Insufficient Balance!!");
                else
                {
                    System.out.println("Amount withdrawal= "+amtToWd+"rs.");
                    atm.checkBalance1(amtToWd);
                }
            }
            else if(press==2)
            {
                System.out.print("Enter amount to deposit: ");
                amtToD= sc.nextInt();
                dp= atm.deposit(amtToD);
                System.out.println("Amount deposited= "+amtToD+"rs.");
                atm.checkBalance2(amtToD);
            }
            else
                System.out.println("Invalid input!!");
        }
    }
}
class Bank
{
    static int balance= 100;
    String name;
    int accNo;
    Bank(String name, int accNo)
    {
        this.name= name;
        this.accNo= accNo;
    }
    void holder(String name, int accNo)
    {
        name= name.toUpperCase();
        System.out.print("Account holder: '"+name+"' , ");
        System.out.println("Account no: '"+accNo+"'");
    }
}

class Atm extends Bank
{
    Atm(String name, int accNo)
    {
        super(name, accNo);
    }
    int withdrawal(int amount)
    {
        if(amount>balance)
            return -1;
        amount= balance-amount;
        return amount;
    }
    int deposit(int amount)
    {
        amount= balance+amount;
        return amount;
    }
    void checkBalance1(int a1)
    {
        int wd= withdrawal(a1);
        if(wd!=-1)
            balance=  balance-a1;
        System.out.println("Current balance: "+balance+"rs.");
    }
    void checkBalance2(int a2)
    {
        balance=  balance+a2;
        System.out.println("Current balance: "+balance+"rs.");
    }
}