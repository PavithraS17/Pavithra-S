public class Fprgm6
{
public static void main(String args[])
{
String gender=args[0];
int age=Integer.parseInt(args[1]);
if((gender.equals("Female"))&&(age>0||age<59))
{
System.out.println("The percentage of interest is 8.2% ");
}
else if((gender.equals("Female"))&&(age>58||age<101))
{
System.out.println("The percentage of interest is 9.2% ");
}
else if((gender.equals("Male"))&&(age>0||age<59))
{
System.out.println("The percentage of interest is 8.4% ");
}
else if((gender.equals("Male"))&&(age>58||age<101))
{
System.out.println("The percentage of interest is 10.5% ");
}
}
}
