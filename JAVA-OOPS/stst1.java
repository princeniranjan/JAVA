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
   
}
class MOB
{
    public static void main(String arg[])
    {
        MOBILE obj1 = new MOBILE();
        obj1.model = "APPLE";
        obj1.price = 1200;
        obj1.show();

        MOBILE obj2 = new MOBILE();
        
        


    }
}

