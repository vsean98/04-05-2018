package good;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int []List=new int[5];
	        
	        int sum=0;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Key in 5 numbers");
	        for(int i=0; i<List.length; i++)
	        {
	        
	            List[i]=scan.nextInt();
	            
	            sum=(sum+List[i]);
	            
	        }
	        System.out.println(sum/5+" Is the average of your 5 numbers");
	    	
	}

}
