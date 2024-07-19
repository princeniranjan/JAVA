class human
{
    private int age;
   private  String name;

   public int getage() // getting the value
   {
     age = age +10;
     return age;
   }

   public void setage(int a) // setting the value
   {
       age = a;
   }
   public void setname(String n)
   {
       name = n;
   }


   public String getname()
   {
      return name;
   }
}
 class encap
{
   public static void main(String a[])
   {
      human en = new human();
      en.setage(19);
      en.setname("KUMAR");
      System.out.print(en.getname() + ":" + en.getage());

   }
}