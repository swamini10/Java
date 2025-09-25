package collectiondemo.arraylist;

import java.util.ArrayList;

public class Data {
	public static void main(String[] args) {
		ArrayList StudentData =new ArrayList();
		StudentData.add(3463712);
		StudentData.add("swamini");
		StudentData.add(true);
		StudentData.add(17.2);
		System.out.println(StudentData);
		

		ArrayList StudentData1 =new ArrayList();// in array list we can add n numbers of elements in it
		for(int i=0;i<1000000;i++) {
			StudentData1.add(i);
		}
		System.out.println(StudentData1);

	}

}
//Array List
//array list size is not fixed
//array list is collection of different data type