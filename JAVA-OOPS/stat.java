class cellphone
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " :" + price + " :" + name );  
    }
     

}
public class stat
{
   public static void main(String a[])
   {
    cellphone cel = new cellphone();
    cel.brand = "APPLE";
    cel.price = 100000;
    cellphone.name = "SMARTPHONE";

    cellphone cel1 = new cellphone();
    cel1.brand = "SAAMSUNG";
    cel1.price = 120000;
    cellphone.name = "FLIP";

    cellphone.name = "MOBILE";

    cel.show();
    cel1.show(); 

   }    
}
