package good;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] List=new int[5];
		int counter=0;

		    Scanner scan=new Scanner(System.in);
		    System.out.println("Key in 5 different numbers to find if even or odd ");
		    for (int i=0; i<List.length; i++)
		    {
		        List[i]=scan.nextInt();
		        
		    }
		    
		    for (int j=0; j<List.length; j++)
		        
		    {
		        if (List[j]%2==0)
		        {
		            counter++;
		        }
		        
		        
		    }
		        
		        
		    
		    System.out.println(counter);
		    System.out.println("You Have "+counter+ " even numbers and "+ (List.length-counter)+" odd numbers");
		    }
		    
	}


