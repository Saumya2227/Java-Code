public class sumation {

	public static double fact(double p)
	{
	double j,fact=1;
	for(j=1;j<=p;j++) {
		fact=fact*j;
	}
	return fact;
}
public static void main(String[] args) {
	int p=10;
	double sum=0.0;
	for(double j=1;j<=p;j=j+2.0)
	{
		double m=fact(j+1);
		sum=sum+(j/m);
	}
	System.out.print("The Sum of Series is" +" "+ sum);
	}
}