package sectionTests;

import java.util.StringJoiner;

import javax.swing.SortingFocusTraversalPolicy;

public class Test {

	static {int x = 10;}
	
	public static void main(String[] args) {
		System.out.println(Color.Red.getValue());
		String string = "hello";
		String string2 = "hello2";
		String string3 = "hello3";
		StringJoiner sj = new StringJoiner("-", "[", "]");
		sj.add(string);
		sj.add(string2);
		sj.add(string3);
		System.out.println(sj);
	}
	
}

