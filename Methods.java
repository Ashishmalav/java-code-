// program to explain the void mathod in function //

import java.util.Scanner;

public class Methods
{
 // static void string()
 //     {
//        Scanner am=new Scanner(System.in);
//        System.out.print("enter your name :");
//        String name= am.next();
//        System.out.println(name);
//     }
    static int change(int [] arr)
    {
       arr[0]=31;
       return arr[0];
    }
    public static void main(String[] args) {
        int marks[]={1,3,4,5,6,};
        change(marks);
        System.out.println("the value of the index arr[0] will be after change:"+marks[0]);
//      string();
    }
}
//method over loading  in java

