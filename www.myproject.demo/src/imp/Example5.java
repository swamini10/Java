package imp;
import java.util.Scanner;
public class Example5 {
	//limit of an array is given when user enter 
	//a number add this number to previous number and print the 
	//addition after the enter the number till 
	//array limit squentially if user enters 
	//unsequential number then exit from the loop
	public static int [] getSum(int [] a) {
		  int sum = 0;
	        int previousNumber = -1; // Initialize with a value that won't be entered sequentially at the start
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < a.length; i++) {
	            System.out.println("Enter a number (sequential to " + previousNumber + "): ");
	            int enteredNumber = sc.nextInt();
	            if (enteredNumber != previousNumber + 1 && previousNumber != -1) {
	                System.out.println("Unsequential number entered. Exiting loop.");
	                break; // Exit the loop if the number is not sequential
	            }
	            sum += enteredNumber; // Add the entered number to the sum
	            a[i] = sum; // Store the current sum in the array
	            System.out.println("Current sum: " + sum);
	            previousNumber = enteredNumber; // Update previousNumber for the next iteration
	        }
	        return a; 
	}
	
	public static void main(String[] args) {
		int a[]=new int[5];
		int [] summ=Example5.getSum(a);
		 if (summ != null) {
	            System.out.println("Final sums in array:");
	            for (int s : summ) {
	                System.out.print(s + " ");
	            }
	            System.out.println();
	     }
	}
}