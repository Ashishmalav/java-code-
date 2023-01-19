import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("enter the lenght of the array :");
        int n = am.nextInt();
        int arr[] = new int[n];
        n = arr.length;
        for (int i=0;i<n;i++)
        {
            System.out.print("enter the value of the element "+(i+1)+":");
             arr[i]=am.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}