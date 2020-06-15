public class Fprgm1b{
public static void main(String args[]){
	int one=Integer.parseInt(args[0]);
	int two=Integer.parseInt(args[1]);
	int val1=one%10;
	int val2=two%10;
	boolean abc=false;
	if(val1==val2)
		{
			abc=true;
			System.out.println(abc);
		}
	else
		{
			System.out.println(abc);
		}
	}
}