public class forloop1
{
  public static void main (String a[])
  {
    for (int i = 1;i<=5;i++ )
    {
      System.out.println("Day " + i);
      System.out.println("WORKING TIME FROM");
      for (int j = 1; j <=9; j++)
      {
        System.out.println(" " + (j+8) + " - " + (j+9));

      }
      System.out.println(" TIME UP");

    }
  }
}
