public class Fprgm5{
public static void main(String args[])
{

char input=args[0].charAt(0);
 if((input>=65 && input<=90) ||(input>=97 &&input<=122))
 {
  System.out.println("Alphabet");
 }
else if(input>=46 && input<=57)
{
System.out.println("Digits");
}
else 
{
System.out.println("Special Characters");
}
}
}