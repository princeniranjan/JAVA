class calculator
{
      int a ;
      int add( int n1 , int n2) // public may or maynot include
      {
       int r = n1+n2;
       return r;
      } 
       
    
}

public class createobj
{
    public static void main(String a[])
    {
        int num1 = 4;
        int num2 = 5;
        calculator calc = new calculator();
        int result = calc.add(num1,num2);
        System.out.print(result);

    }
}
