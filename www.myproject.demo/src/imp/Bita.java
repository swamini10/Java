package imp;
/// sum of array element 
//imp
public class Bita {
	public int sumOfArray(int []array) {
		int sum=0;
		for (int i = 0; i < array.length ; i++) { 
		sum+= array[i];
		}
		return sum ;
	}
	public static void main(String[] args) {
		int []a = {1,6,5,3,2,8};
		Bita b =new Bita();
		System.out.println(b.sumOfArray(a));
		
	}

}
