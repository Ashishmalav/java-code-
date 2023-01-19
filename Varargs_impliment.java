public class Varargs_impliment
{static  int  sum(int...arr) {
    int result = 0;
    for (int a=0;a<=arr.length;a++)
    {
      result=result+a;
    }
    return result;
     }

    public static void main(String[] args)
    {
        System.out.println("the sum of 4 & 5 is "+sum(1,2,3));
        System.out.println("the sum of 4 & 5 is "+sum(3,5,4));
        System.out.println("the sum of 4 & 5 is "+sum(3,5,2,5));
    }
}