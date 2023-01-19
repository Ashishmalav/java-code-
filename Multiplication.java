import java.util.Scanner;
public class Multiplication
{public static void main(String[]args)
{
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int i=0;

    for(i=0;i<10;i++)
    { int result=2*i;
        System.out.println( N+"X"+i+"="+result);
    }


}
}

