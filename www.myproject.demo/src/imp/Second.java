package imp;
//imp
public class Second {
	public static void getAbridgedVersion(int a[]) {
		for (int i = 0; i < a.length ; i++) {
			if (a[i] != a[i+1]) {
			  System.out.println(a[i]);
		
		}}
//		int []array= {};
	}

	public static void main(String[] args) {
		int a[]= {10,30,40,40,2};
		
		//output:10,30,2
//		int [] version =Second.getAbridgedVersion(a);
	}
}
