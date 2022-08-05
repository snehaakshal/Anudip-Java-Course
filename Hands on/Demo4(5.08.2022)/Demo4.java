class Sneha
{
Sneha()
{
System.out.println("no-constructor");
}
Sneha(int i,String Sname)
{
System.out.println("2-argument constructor" +i+Sname);
}
public static void main(String[]args)
{
{
 System.out.println("Running instance initialized block.");
 Sneha obj=new Sneha();
 Sneha obj1=new Sneha(10,"Abitha");
 System.out.println("Running static initialization block");
 Demo4.func(8);
 
}
}
public class Demo4{
     static int x = 10;
     static int y;
     static void func(int z)
{
    System.out.println("x =" +x);
    System.out.println("y =" +y);
    System.out.println("z =" +z);
    
}
static {
      System.out.println("Running static initialization block.");
      y = x + 5;
   }
 }
}
    