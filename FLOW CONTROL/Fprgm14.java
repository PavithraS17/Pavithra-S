public class Fprgm14{
public static void main(String args[]){
	int val=Integer.parseInt(args[0]);
	int remainder;
	int sum=0;
		while(val>0)
			{
				remainder=val%10;
				sum=sum+remainder;
				val=val/10;
			}
	System.out.println(sum);
	}
}
				