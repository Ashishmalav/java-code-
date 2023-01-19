import java.util.Scanner;

public class Difernt_print_method
{
 public static  void main(String[]args)
   {
    Scanner SC = new Scanner(System.in);
    System.out.print("enter your name in any case:");
    String name = SC.nextLine();
    int value = name.length();
    System.out.println("the length of the name is : " + value);
    String lowercase = name.toLowerCase();
    String uppercase = name.toUpperCase();
    System.out.println(lowercase);
    System.out.println(uppercase);
    System.out.print("enter a nontrimed string :");
    String nontrimedstring = SC.nextLine();
    String trimed = nontrimedstring.trim();
    System.out.println(trimed);
    System.out.println(name.substring(3));
    System.out.println(name.substring(1,6));
    System.out.println(name.replace('s','b'));
    String speach=" hamare principal sahab  ne yaha is collage me chamatkar pe chamatkar kiye hai ,\nhame to ashchary hai ki koi admi apne smapurn jivankal kal me itne chamatkar kese kar skta hai ";
    System.out.println(speach.replace("chamatkar","balaatkar"));
           System.out.print("your name starts with the latter a: ");
      System.out.println(name.startsWith("a"));
           System.out.print("your name ends with the latter sh : ");
      System.out.println(name.endsWith("sh"));
           System.out.print("the first index value to appear s is :");
       System.out.println(name.indexOf('s'));
           System.out.print("the first index value to apper 'is' from index 2 is:" );
       System.out.println(name.indexOf("is",2));
           System.out.print("latter present at index 3 is :");
       System.out.println(name.charAt(3));
           System.out .print(" the index value of the cheracter from the ends with 'is' from is : ");
       System.out.println(name.lastIndexOf("is"));
           System.out.print("Is your name is correct : ");
       System.out.println(name.equals("ashish"));
           System.out.print("is your name is correc:");
       System.out.println(name.equalsIgnoreCase("ASHISH"));


   }
}