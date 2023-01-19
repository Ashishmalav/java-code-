import java.util.Scanner;

public class Array_2D
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the array : ");
        int l= sc.nextInt();
        System.out.print(" enter the width of the array : ");
        int w= sc.nextInt();
        int mat_1[][]= new int[l][w];
        int mat_2[][]= new int[l][w];
        int   sum[][]= new int[l][w];
        System.out.println("let's enter the values of the elements for the first metrix : ");
        for (int i=0;i<l;i++)
        {
            for (int j = 0; j < w; j++)
            {
                System.out.print("enter the value of the element at the postion ("+(i+1)+","+(j+1)+") is:");
                  mat_1[i][j]=sc.nextInt();
            }
        }
        System.out.println("the value of the element are as follows :");
        for (int i=0;i<l;i++)
        {
            for (int j = 0; j < w; j++)
            {
                System.out.println(" the value of the element at the postion ("+(i+1)+","+(j+1)+") is:"+mat_1[i][j]);

            }
        }
        System.out.println("the matrix of the element is:");
        for (int i=0;i<l;i++)
        {
            for (int j = 0; j < w; j++)
            {
                System.out.print(mat_1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("let's enter the values of the element of the second matrixs");
        for (int i=0;i<l;i++)
        {
            for (int j = 0;j < w; j++)
            {
                System.out.print("enter the value of the element at the postion ("+(i+1)+","+(j+1)+") is:");
                mat_2[i][j]=sc.nextInt();
            }
        }
        System.out.println("the value of the element are as follows :");
        for (int i=0;i<l;i++)
        {
            for (int j = 0; j < w; j++)
            {
                System.out.println(" the value of the element at the postion ("+(i+1)+","+(i+1)+") is:"+mat_2[i][j]);

            }
        }
        System.out.println("the matrix of the element is:");
        for (int i=0;i<l;i++)
        {
            for (int j = 0; j< w; j++)
            {
                System.out.print(mat_2[i][j]+" ");
            }
            System.out.println(" ");
        }
         System.out.println("sum of the matrix 1 & 2");
        for(int i=0;i<l;i++)
        {
            for (int j=0;j<w;j++)
            {
              sum[i][j]=mat_1[i][j]+mat_2[i][j];
            }
        }
        for(int i=0;i<l;i++)
        {
            for (int j=0;j<w;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
