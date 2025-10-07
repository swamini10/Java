package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
	public void getFile()throws FileNotFoundException{
		FileInputStream fs=new FileInputStream("");
	}
	public void readFile()throws FileNotFoundException{
		getFile();
	}
	
	public void signFile()throws FileNotFoundException{
		readFile();
	}
	
	public void submitFile() {
		try {
			signFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		public void emitFile() {
			submitFile();
		}
		
	
	}

}
