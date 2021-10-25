import java.util.Scanner;
public class title {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s=in.nextLine();
		s=" " + s;
		String f = "";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				f=f + ch;
				i++;
				ch =s.charAt(i);
				f=f+Character.toUpperCase(ch);
				
			}
			else
			{
				f=f+ch;
				
			}
			
		}
		f=f.trim();
		System.out.println(f);
	}

}
