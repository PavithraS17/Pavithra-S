public class Fprgm12{
public static void main(String args[])
{
 	int value=Integer.parseInt(args[0]);
 	boolean status=true;
 	for(int i=2;i<=value/2;i++)
 		{
			if(value%i==0)
			{
			status=false;
			break;
			}
		}
if(status==true)
{
System.out.println(" The given value is a Prime Number");
}
else{
System.out.println("The given value is not a Prime Number");
}
}
}