
public class karpekar {
	public static void main(String[]args) {
	for(int i=1;i<=1000;i++)
	{
	int n=i;
	int d=n,c=0;
	while(n!=0)
	{
	n/=10;c++;
	}
	int p=d*d;
	int o=p/(int)Math.pow(10,c);
	int t=p%(int)Math.pow(10,c);
	if(d==(o+t))
	System.out.println(i);
	}
	}
	}

	