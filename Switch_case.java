import java.util.Scanner;
public class Switch_case
 {public static void main(String[]args) {
     Scanner Sc = new Scanner(System.in);
     System.out.print("Enter your marks :");
     int marks = Sc.nextInt();
     System.out.println(marks);
        if (marks>=75 && marks<=100) {
            System.out.println(" you are first devision pass");
        }
        else if (marks>=50 && marks<75)
       {
           System.out.println(" you are second division pass");
       }
      else if (marks>=33 && marks<50)
       {
           System.out.println(" you are third division pass");
       }
       else
       {
           System.out.println("your are fail");
       }
         System.out.println("chose a option ");
         int choise =Sc.nextInt();
     switch (choise)
     {
         case 1:
             System.out.println("docter");
             break;
         case 2:
             System.out.println("engineer");
             break;
         case 3:
             System.out.println("loyer");
             break;
         default:
             System.out.println("invalid button ");

     }
   }
 }
