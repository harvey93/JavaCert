package sectionTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		String str = "hello";
		String str1 = str.replace('l', 'x');
//		System.out.println(str);
		sb.replace(0, 2, "vazgen");
		System.out.println(sb);
		
	}
	
}


interface Inter{
	
}

class TestA{
	
	protected int weight = 3;
	private int height = 5;
	
	public int getHeight(){
		return height;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void method(String [] arr) throws IOException{return;};
	
//	public void method(String str) throws FileNotFoundException{
//		
//	}

}

class TestB extends TestA implements Inter{
	public int weight = 10;
	public int height = 5;
	
	
	public void print(){
		System.out.println(super.getWeight());
		System.out.println(super.getHeight());
	}

	public void method() throws FileNotFoundException{
		
	}
}

