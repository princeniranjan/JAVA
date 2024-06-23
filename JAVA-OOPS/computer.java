public class computer
{
  public void playmusic()
  {
    System.out.println("Music playing...");

  }  
   public String GetMePen( int cost)
  {
   if (cost >= 10)
      return "Pen";

   return "Nothing";   
  }

}
class demo 
{
    public static void main(String a[])
    {
        computer obj = new computer();
        obj.playmusic();
        String str = obj.GetMePen(2);
        System.out.println(str);    
    }
}
