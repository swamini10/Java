package Comm.array;

public class A {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50}; // way to write array
		System.out.println(a[0]);
		System.out.println(a.length);
		
		
		int marks[]= new int[5];//2nd way
		marks[0]=10;
		marks[1]=50;
		marks[2]=60;
		marks[3]=70;
		marks[4]=80;
		marks[5]=90;
		System.out.println(marks[3]);
	}

}
