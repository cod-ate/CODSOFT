//                                  TO-DO LIST
//      Task-4 solution for C++ PROGRAMMING (using JAVA language)

import java.util.*;
class Task_6
{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<ToDo> list= new ArrayList<>();
        int count= 0;
        while(true)
        {
            System.out.print("Press '1' to add task and it's status, '0' to end: ");
            int press= sc.nextInt();
            if(press==0)
                break;
            count++;
            addTask(list);
        }
        if(count>0)
        {
            System.out.println();
            System.out.println("Task List:");
            displayList(list);
            System.out.println();
            int countInner = 0;
            while (true)
            {
                System.out.print("Press '1' to update status, '0' to end: ");
                int press = sc.nextInt();
                if (press == 0)
                    break;
                countInner++;
                boolean b= updateStatus(list);
                if(!b)
                    System.out.println("Element does not exist!!\nEnter valid data");
            }
            if (countInner > 0)
            {
                System.out.println();
                System.out.println("Task status updated:");
                displayList(list);
                System.out.println();
            }
            else
                System.out.println("No updates!!\n");
        }
        if(count>0)
        {
            int countInner = 0;
            while(true)
            {
                System.out.print("Press '1' to remove task, '0' to end: ");
                int press= sc.nextInt();
                if(press==0)
                    break;
                countInner++;
                boolean b= removeTask(list);
                if(!b)
                    System.out.println("Element does not exist!!\nEnter valid data");
            }
            if(countInner>0)
            {
                System.out.println();
                System.out.println("Updated task list:");
                displayList(list);
            }
            else
                System.out.println("Nothing removed!!");
        }
        else
            System.out.println("List is Empty!!");
    }

    public static void addTask(ArrayList<ToDo> list)
    {
        System.out.print("Enter task (for multiple words use '_' to separate them, Eg: Code_Java): ");
        String task= sc.next();
        System.out.print("Enter status(completed/pending): ");
        String status= sc.next();
        list.add(new ToDo(task, status));
    }

    public static void displayList(ArrayList<ToDo> list)
    {
        for(ToDo value: list)
            System.out.println(value.task.toUpperCase()+" "+value.status.toUpperCase());
    }

    public static boolean updateStatus(ArrayList<ToDo> list)
    {
        System.out.print("Enter task (for multiple words use '_' to separate them, Eg: Code_Java): ");
        String task= sc.next();
        String status= null;
        int i= 0;
        for(ToDo value: list)
        {
            if(value.task.equalsIgnoreCase(task))
            {
                System.out.print("Enter status(completed/pending): ");
                status= sc.next();
                break;
            }
            i++;
        }
        if(i==list.size())
            return false;
        list.set(i, new ToDo(task, status));
        return true;
    }

    public static boolean removeTask(ArrayList<ToDo> list)
    {
        System.out.print("Enter task (for multiple words use '_' to separate them, Eg: Code_Java): ");

        String task= sc.next();
        int i= 0;
        for(ToDo value: list)
        {
            if(value.task.equalsIgnoreCase(task))
                break;
            i++;
        }
        if(i==list.size())
            return false;
        list.remove(i);
        return true;
    }
}

class ToDo
{
    String task, status;
    ToDo(String task, String status)
    {
        this.task= task;
        this.status= status;
    }
}