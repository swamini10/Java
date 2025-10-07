package imp;
import java.util.Arrays;
//imp
public class DataTwo {
	public static int[] getsum (int arr[],int target) {
		
   for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i] + arr[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 7};

        int[] result = DataTwo.getsum(arr, 9);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }
   
        // Example test cases:
        // Target 90: Output: No pair found
        // Target 9: Output: [0, 1]
        // Target 10: Output: [2, 3]
    }
}

