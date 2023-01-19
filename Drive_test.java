import java.util.Scanner;

public class Drive_test
{
    public static void main(String[]args)
    {
        System.out.println("lets make a programe for the eligiblity ");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name here :");
        String name = sc.next();
        System.out.print("enter your age:");
        byte age = sc.nextByte();

        if (age > 18 || age < 70)
        {
            System.out.println("your age is in our craitarea .so " + name + "you can drive ");
        } else {
            System.out.println("you age is not in our craitarea .so " + name + "you can't drive");
        }
    }
}
