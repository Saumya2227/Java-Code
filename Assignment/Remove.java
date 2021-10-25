import java.util.Scanner;

public class Remove {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:"); 
	    String s1 = sc.nextLine();
	    String s2= s1.replaceAll("   " ," " );
	    System.out.println(s2);
	}
}
