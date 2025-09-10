package imp;
public class Example4 {
	//remove duplicate elements from the array
	public static int[] getAbridgedVersion(int a[]) {
		if (a == null || a.length == 0) {
            return new int[0];
        }

        // Sort the array to bring duplicate elements together
        // This is a simple bubble sort implementation for demonstration
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Create a temporary array to store unique elements
        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1]; // Add the last element

        // Create a new array of the correct size and copy unique elements
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
	}
	
	
	public static void main(String[] args) {
		int a[]= {10,2,3,2,40,40,30};
		
		//output 10,2,3,40,30
		
		int [] version=Example4.getAbridgedVersion(a);
		
		for(int d:version) {
			System.out.println(d);
		}
	}

}