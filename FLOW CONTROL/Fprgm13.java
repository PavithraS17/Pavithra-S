public class Fprgm13{
public static void main(String args[]){
	for(int i=10;i<100;i++)
		{
			int cnt=1;
			for(int j=2;j<=99;j++)
				{
				if(i%j==0)
					cnt=cnt+1;
				}
		
	if(cnt==2)
		System.out.println(i);
		}
	}	
} 