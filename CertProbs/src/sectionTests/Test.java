package sectionTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	
	static int y = 10;
	public static void main(String[] args) {
		Device device = new MiniDevice();
		Device device2 = new MiniDevice();
	}
	
	static {y = 15;}
	
	public static void method() throws IOException{
		try{
			
			throw new IOException();
			
		}catch(FileNotFoundException e){
			
		}
	}
}
