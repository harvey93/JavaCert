package sectionTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		try{
			method();
		}catch(IOException e){
			System.out.println("hello");
		}
	}
	
	public static void method() throws IOException{
		try{
			
			throw new IOException();
			
		}catch(FileNotFoundException e){
			
		}
	}
}
