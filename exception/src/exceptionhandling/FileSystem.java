package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileSystem {
	public static void main(String[] args) {
	try {
		FileInputStream fs=new FileInputStream("D:\books");
	}//this will throw compiletime exception
	catch(Exception e) {
		System.out.println("Exception Handled");
	}
	
//	catch(FileNotFoundException e) {
//		e.printStackTrace();//shows status of exception
//	}
	}

}
