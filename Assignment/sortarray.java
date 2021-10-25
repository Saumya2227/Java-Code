import java.util.Scanner;
public class sortarray{   
	    public static void main(String[] args) {
	   
	    	Scanner k=new Scanner(System.in);
	    	System.out.print("Enter the number");
	    	 int n=k.nextInt();
	    int [] arr = new int [n];        
	        System.out.println("Elements all the element: ");    
	        for (int i = 0; i < n; i++) {     
	            arr[i]=k .nextInt();   
	        }   
	        int temp=0;
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	         System.out.println();      
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i <arr.length ; i++) {     
	            System.out.println(arr[i] + " ");    
	        }    
	    }    
}
