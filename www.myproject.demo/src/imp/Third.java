package imp;
import java.util.Scanner;
//imp
public class Third {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int ar[] = new int[5];
	        int sum = 0;
	        System.out.println("Enter 5 array elements:");
	        for (int i = 0; i < ar.length; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            ar[i] = sc.nextInt();
	            sum += ar[i]; // update sum
	            int[] expectedSums = {1, 3, 6, 10, 15};

	            if (sum != expectedSums[i]) {
	                System.out.println(" Error: sum ");
	                System.out.println("Program stopped.");
	                break;
	            }
	            System.out.println("✅ Running sum: " + sum);
	        }
	        sc.close();
		//output :element :1  [0]+1=2   then we enter element :2  1+2=3   then we enter element :3   3+3=6
		//then we enter element :6  3+6=9   then we enter element :9   6+9=15   then we enter element :15   6+15=21
		//if we enter other and the produced sum then give error and stop
	}
}
