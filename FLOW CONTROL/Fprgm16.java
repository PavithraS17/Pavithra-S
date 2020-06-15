public class Fprgm16
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int reverse=0;
while(num!=0)
{
reverse=reverse*10;
reverse=reverse+num%10;
num=num/10;
}
System.out.println(reverse);
}
}