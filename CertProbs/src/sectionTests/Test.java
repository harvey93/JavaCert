package sectionTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	int x = y;
	static int y = 10;
	public static void main(String[] args) {
		Long long1 = new Long(3);
		Double double1 = 5.0;
		
	}
	
	static {y = 15;}
	
	public static void method() throws IOException{
		try{
			
			throw new IOException();
			
		}catch(FileNotFoundException e){
			
		}
	}
}