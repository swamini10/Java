package com.exceptionhandling.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileSystem {
	public static void main(String[] args) {
		try {
			FileInputStream fs =new FileInputStream("D:\\project\\onlinevoting");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
//compiletime exception