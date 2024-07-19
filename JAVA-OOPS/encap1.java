class human
{
    private int age;
   private  String name;

   public int getage() // getting the value
   {
     age = age +10;
     return age;
   }

   public void setage(int age) // setting the value
   {
       this.age = age; //"THIS " it is used to refer the current object calling this method
   }
   public void setname(String name)
   {
       this.name = name;
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