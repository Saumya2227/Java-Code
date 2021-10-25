import java.util.Scanner;
public class FrequencyArray {
    
  public static void main(String[] args) {  

  	Scanner sc=new Scanner(System.in);
  	System.out.print("Enter the number");
  	 int n=sc.nextInt();
  int [] arr = new int [n];        
      System.out.println("Enter all the element: ");    
      for (int i = 0; i < n; i++) {     
          arr[i]=sc.nextInt();    
    
      int [] fr = new int [arr.length];  
      int visited = -1;  
      
      for(int m = 0; m < arr.length; m++){  
          int count = 1;  
          for(int j = m+1; j < arr.length; j++){  
              if(arr[m] == arr[j]){  
                  count++;   
                  fr[j] = visited;  
              }  
          }  
          if(fr[m] != visited)  
              fr[m] = count;  
      }
      System.out.println(" Element | Frequency");  
   
      for(int m = 0; m < fr.length; m++){  
          if(fr[m] != visited)  
              System.out.println("    " + arr[m] + "    |    " + fr[m]);  
      }  
      }
  }  
}  
