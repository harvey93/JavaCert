package cache;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) throws Exception{
		HashMap<String, Integer> map = new HashMap<>(3);
		map.add("first", 10);
		map.add("third", 30);
		map.add("fourth", 50);
		System.out.println(map.contains("third"));
	}

}
