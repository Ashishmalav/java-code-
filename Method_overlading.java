public class
 Method_overlading
{  static void foo()
     {
         System.out.println("hyyy dark soul, how are you ");
     }
    static  int foo(int a)
      {
          System.out.println("hyyy dark soul "+a+" , how are you");
         return a;
      }
      static  int foo(int a, int b)
      {
          System.out.println("hyy dark soul "+a+ " ,how was your day "+b+ " .");
          return a;
      }

     public static void main(String[] args)
    {
      foo();
      foo(1);
      foo(2,1);
    }
  // use of varargs in java method overloading //


}
