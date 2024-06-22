public class nestedloop
{
    public static void main(String a[])
    {
        int i = 1 ;
        while (i<=6)
        {
            System.out.println("HI " + i);
            int j = 1;
            while (j<=3)
            {
                System.out.println("HELLO " + j);
                j++;

            }
        i++;    
        }
        System.out.print("BYR " + i);
    }
}