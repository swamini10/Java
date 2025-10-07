package collection.array.demo;

public class Demo {
	public static void main(String[] args) {
		int [] arr =new int [4];  //int type data
		arr[0]=10000;
		arr[1]=30000;
		arr[2]=939393;
		arr[3]=393939;
		System.out.println(arr[2]);
		
		Object [] arr1 =new Object [4];  //object type data
		arr1[0]=10000; //primitive -> Object
		arr1[1]="swamini";
		arr1[2]='s';
		arr1[3]=true;
		System.out.println(arr1[1]);
	}

}
//Limitation of array
// array size is fixed
// array is collection of same data type