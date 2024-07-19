class student 
{
    int regno;
    String name;
    int marks;
}



public class array4 
{
  public static void main(String a[])
  {
    student s1= new student();
     s1.regno = 1;
     s1.name = "tom";
     s1.marks = 88;

    student s2 = new student();
    s2.regno = 2;
    s2.name = "kiran";
    s2.marks = 99;
 
    student students [] = new student[2];
    students[0] = s1;
    students[1] = s2;
   // for(int i = 0; i<students.length;i++)
    //{
  //      System.out.println(students[i].name + " :" + students[i].marks );

    //}
    for(student stu:students)
    {
      System.out.println(stu.name + " :   " + stu.marks );
    }
  }  




}
