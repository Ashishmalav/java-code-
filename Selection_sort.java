import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("enter length of the array (n):");
        int n = am.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the value of element " + (i + 1) + ":");
            arr[i] = am.nextInt();
        }
        System.out.print("the entered arr is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        //for the selection sorting
        for (int i=0;i<arr.length-1;i++)
        {   int smallest =i;
            for (int j=i+1;j<arr.length;j++)
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
             int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.print("the entered array after sorting :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
