import java.util.Scanner;
public class Pattern_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("prograem to print the half triangle patten");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//@#@#@#@#@#@#@#@#@@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@####@
        System.out.println("=====================================================================\nprograme to print the half triangle downward ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
//@#@#@#@#@#@#@#@#@#@#@#@@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@####@
            System.out.println("=====================================================================\nprograme to print the left half triangle downward ");
            for (int k = 1; k <= n; k++) {
                for (int j = n; j >= k; j--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}