import java.util.Scanner;
class Student
{
 int roll_no;
 String name;
 float mark;
 void showDetails()
 {
 	System.out.println("This is non static method");
 	System.out.println("Name:"+name);
 	System.out.println("Roll no"+roll_no);
 	System.out.println("Mark"+mark);
 }
 
 static void Show()
 {
 System.out.println("This is static method");
 }
 
  public static void main(String arg[])
  {
    try
       {
         Scanner s=new Scanner(System.in);
         Student s1=new Student();
         System.out.println("Enter roll number");
         s1.roll_no=s.nextInt();
         System.out.println("Enter name:");
         s1.name=s.nextLine();
         System.out.println("Enter mark:");
         s1.mark=s.nextFloat();
         s1.showDetails();
         Show();
         }
         
        catch(Exception e)
        {
          System.out.println(e);
          }
          }
          }
          
