
public class pattern {

		public static void main(String[] args) {
			int k=8;
			for(int i=1;i<=8;i++)
			{
				for(int j=0;j<k;j++) {
					int m=(int)(i*(Math.pow((i+1),j)));
					System.out.print(m+" ");
					m=0;
				}
				System.out.println();
				--k;
			}

		}

	}
