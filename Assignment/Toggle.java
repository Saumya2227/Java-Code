import java.util.Scanner;
public class Toggle {

	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter text:");
		String text=scan.nextLine();
		char a[]=text.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			
			    
			        if (a[i]>='A' && a[i]<='Z') {
			            a[i] = (char)((int)a[i] +32);
			        }
			        else if (a[i]>='a' && a[i]<='z')
			        {
			        	
			        
			            a[i]= (char)((int)a[i]-32);
			        }
			    }
						
		System.out.println("Toggled");
		
	for(int i=0;i<a.length;i++)
		System.out.print( a[i]);
		
}
}
