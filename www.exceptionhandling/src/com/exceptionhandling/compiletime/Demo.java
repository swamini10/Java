package com.exceptionhandling.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Demo {
	
		public void getFile() throws FileNotFoundException{
		FileInputStream fs =new FileInputStream("");
	   }
		public void readFile()  throws FileNotFoundException{
			getFile();
		}
		public void signFile()  throws FileNotFoundException{
			readFile();
		}
		public void sumitFile()  {
			try {
				signFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 }

//throws keyword
//using this keyword we can declare the excepation
//and we can handle the exception using try catch block