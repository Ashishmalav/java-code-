import java.util.Scanner;
public class All_include
 {
     public static void main(String[]args)
     {
       Scanner SC =new Scanner(System.in);
         System.out.print("ENTER YOUR NAME:");
         String name= SC.nextLine();
         int value =name.length();
         String lowercase  = name.toLowerCase();
         System.out.println(lowercase);

         System.out.println("the length of your name is "+value);
         System.out.print("enter an option acoording to yout field for ENGINEERING select 1,for MADICAL select 2 ,for other select 3:");
         int field=SC.nextInt();
         int total=300;
         switch (field)
         {
             case 1:
             {
                 System.out.println("As expected you are from engineering field ,so tell me your marks in all subjects");
                 System.out.print("enter your marks in maths : ");
                 float maths = SC.nextFloat();
                 System.out.print("enter your marks in physics : ");
                 float physics = SC.nextFloat();
                 System.out.print("enter your marks in chemistry: ");
                 float chemistry = SC.nextFloat();
                 float sum = maths + physics + chemistry;
                 float perc = sum / total * 100;
                 if (perc >= 75 && perc <= 100) {
                     System.out.print(name + "you have got"  + perc +  "percent marks and your first division pass");
                 } else if (perc >= 50 && perc < 75) {
                     System.out.print(name + "you have got"  + perc +  "percent marks and your second division pass");
                 } else if (perc >= 33 && perc < 50) {
                     System.out.print(name + "you have got"  + perc +  "percent marks and your third  division pass");
                 } else if (maths < 33 || physics < 33 || chemistry < 33 || sum < 99) {
                     System.out.println(name + "you have got"  + perc +  "percent marks and which is below passing craitarea,so your fail");
                 }
                 break;

             }
             case 2:

             {
                 System.out.println("As expected you are from medical field ,so tell me your marks in all subjects");
                 System.out.print("enter your marks in biology : ");
                 float biology = SC.nextFloat();
                 System.out.print("enter your marks in physics : ");
                 float physics = SC.nextFloat();
                 System.out.print("enter your marks in chemistry: ");
                 float chemistry = SC.nextFloat();
                 float sum = biology + physics + chemistry;
                 float perc = sum / total * 100;
                 if (perc >= 75 && perc <= 100) {
                     System.out.print(name + "you have got" + perc + "percent marks and your first division pass");
                 } else if (perc >= 50 && perc < 75) {
                     System.out.print(name + "you have got" + perc + "percent marks and your second division pass");
                 } else if (perc >= 33 && perc < 50) {
                     System.out.print(name + "you have got" + perc + "percent marks and your third  division pass");
                 } else if (biology < 33 || physics < 33 || chemistry < 33 || sum < 99) {
                     System.out.println(name +"  you have got  " + perc + "    percent marks and which is below passing craitarea,so your fail");
                 }
                 break;

             }
             case 3:
             {
                 System.out.println("your are not eligable to fill the form ");
             }
         }
     }
 }
