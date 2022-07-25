import java.util.*;
class Age{
public static void main(String[]args){
    System.out.print("Enter your age : ");
Scanner age = new Scanner(System.in);
int age1= age.nextInt();

if(age1 < 18)
{
System.out.println("You are Minor");
}
else
{
System.out.println("You are major");
}
}
}