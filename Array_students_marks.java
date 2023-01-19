import java.util.Scanner;

public class Array_students_marks
{
    public static void main(String[] args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.print("enter the no of student in the class :");
        int i= Sc.nextInt();
        System.out.print("enter the no of subject :");
        int j= Sc.nextInt();
        int [][]marks =new int[i][j];
        int MARKS=Sc.nextInt();
         MARKS=marks[i][j];
        for(i=1;i<marks.length;i++)
        {
            for(j=1;j<marks[i].length;j++)
            {
                System.out.println("enter the marks of student "+i+" in subject"+j+" : "+MARKS);
            }

        }
        for(i=1;i<marks.length;i++)
        {
          for(j=1;j<marks[i].length;j++)
          {
              System.out.println("the marks of student "+i+" in subject"+j+"  is :"+marks[i][j]);
          }

        }


    }
}
