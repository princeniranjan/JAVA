
                                       ////////////////METHOD OVERLOADING////////////////////////



public class method 
{
   public int add(int n1,int n2,int n3)
   {
      return n1+n2+n3;
   }  
   public int add(int n1,int n2)
   {
    return n1 + n2;
   }
   public double add(double n1,int n2)
   {
    return n1 + n2 ;
   }

}
class dem
{
    public static void main(String a[])
    {
        method cm = new method();
        int result = cm.add(2,3);
        double result1 = cm.add(1.2,2);
        System.out.println(result);
        System.out.print(result1);

    }

}
