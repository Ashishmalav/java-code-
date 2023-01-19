import java. util.Scanner;
public class practice_pograme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of the n:");
        int n = sc.nextInt();
        System.out.println("so the all odd intigers  in assneding order:");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            if (i > 5)
            {
                System.out.println("bereak ");
                break;

            }
//        System.out.println("all the odd intigers in reverse order");
//        for(int i=n;i>0;i--)
//        {
//            System.out.println(2*i-1);
//        }
        }
    }
}