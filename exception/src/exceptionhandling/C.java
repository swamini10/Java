package exceptionhandling;

public class C {
	public static void main(String[] args) {
		try{int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[5]);
	}catch(Exception e) {
		System.out.println("Array index is out of length");
	}
	}

}
