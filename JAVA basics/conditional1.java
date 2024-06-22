 public class conditional1
{
    public static void main (String args[])
    {
        int x = 7;
        int y = 6;
        int z = 10;

        if (x > y && x > z )
            System.out.println(x);
        else if ( y > z)
            System.out.print(y);
        else 
            System.out.print(z);


    }
}