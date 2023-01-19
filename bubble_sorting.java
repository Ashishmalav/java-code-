import java.util.Scanner;

public class bubble_sorting {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("enter length of the array (n):");
        int n= am.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         System.out.print("enter the value of element "+(i+1)+":");
         arr[i]= am.nextInt();
     }
     for (int i=0; i<n;i++)
     {
         System.out.print(arr[i]+" ");
     }
        System.out.println(" ");
     for (int i=0;i<n-1;i++)
     {for(int j=0;j<n-1;j++)
        if(arr[j]<arr[j+1])
        { int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
     } for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println(" ");
        System.out.println("the same arry in assending order");
        for (int i=0;i<n-1;i++)
        {for(int j=0;j<n-1;j++)
            if(arr[j]>arr[j+1])
            { int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        } for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
    }
    }
}