class MOBILE
{
   String model ;
   int price ;
   static  String name ;

   static
   {
    name = "phone";
    System.out.println("in static");
   }

   //constructor 
   public  MOBILE()
   {
     model = "";
     price = 12000;
     System.out.println("in constructor");
   }
   public void show()
   {
    System.out.print(model + ":" + price + ":" + name);
   }
   public static void show1( MOBILE obj1)
   {
     System.out.print(obj1.model + ":" + obj1.price + ":" + name);
     
   }
   
}
class MOB
{
    public static void main(String arg[])
    {
        MOBILE obj1 = new MOBILE();
        obj1.model = "APPLE";
        obj1.price = 1200;

        MOBILE obj2 = new MOBILE();

        obj1.show();
        MOBILE.show1(obj1);

        


    }
}

