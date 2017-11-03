/*Program demonstrates array concept.
 * In this program we are taking input of 
 * 10 numbers from user and storing it in array. 
 * The task to be performed by us is to 
 * display only the even numbers from array */


import java.util.Scanner;                       //importing java.util.Scanner

public class ArrayEven {                        // class name
	
	public static void main(String[] args) {      //main method
		int[]arr = new int[10];                  // initializing array of size 10. name given to array is arr
		int i;                             //initializing variable(iterator)
		
		System.out.println("Enter TEN numbers : ");      //asking user to enter 10 numbers
		Scanner sc = new Scanner(System.in);           //initializing scanner variable sc
		 
		for(i=0;i<10;i++)		//for loop
		{						//for loop starts
			arr[i]=sc.nextInt();	//elements are stored in array starting from arr[0],arr[1],..........,arr[9]
		}  //when 10 elements are stored loop is terminated
		
		System.out.println("----------------------------------------");
		System.out.println("Numbers entered are : ");  //Displaying numbers entered by user
		System.out.println("--------------------------------------");
		
		for(i=0;i<10;i++)              //printing entered numbers
		{
			System.out.print(arr[i]+" ");              //elements are printed starting from arr[0],arr[1],.....,arr[9]
		}
		System.out.println("\n--------------------------------------");
		System.out.println("\nEVEN numbers in given array are : ");   //printing even numbers
		System.out.println("----------------------------------------");
		
 		for(i=0;i<10;i++)		//loop to print even numbers entered
		{
			if(arr[i]%2==0)        //condition to check whether entered number is even
			{
				System.out.print(arr[i]+" ");  //if number is even then it is printed
			}
		} //for loop terminates
	}  //main method ends

} //end of program
