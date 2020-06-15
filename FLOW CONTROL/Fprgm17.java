public class Fprgm17{
public static void main(String args[])
	{
		int value=Integer.parseInt(args[0]);
		int reverse=0;
		int remainder;
		int temp=value;
		while(value>0)
		{
			remainder=value%10;
			reverse=reverse*10+remainder;
			value=value/10;
		}
	if(temp==reverse)
		System.out.println(args[0]+" is a Palindrome");
	else
		System.out.println(args[0]+" is not a Palindrome");
	}
}