package sectionTests;
import java.math.*;
import java.util.regex.*;
import java.text.*;
import java.io.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Stack;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test {

	
	static int y = 10;
	public static void main(String[] args) {

		System.out.println(isBalancedTwo("{[(])}"));
	}
	
	static {y = 15;}
	
	public static void method() throws IOException{
		
	}
	
	public static boolean isBalancedTwo(String str) {
		boolean res = true;
		Stack<Character> stack = new Stack<>();
		for(Character s : str.toCharArray()){
			if(s == '{'){
				stack.push('}');
			}else if(s == '('){
				stack.push(')');
			}else if(s == '['){
				stack.push(']');
			}else {
				if(stack.isEmpty() || s != stack.peek()){
					res = false;
					break;
				}
				stack.pop();
			}
		}
		return res;

	}
	
	  public static boolean isBalanced(String str) {
	        boolean res = true;
	        String[] arr = str.split("");
	        
	        Stack<String> stack = new Stack<String>();
	        for(String s : arr){
	        	
	            if(s.equals("{") || s.equals("(") || s.equals("[")){
	                stack.push(s);
	            }else if(s.equals("}") || s.equals(")") || s.equals("]")){
	            	
	                if(stack.isEmpty()){
	                    res = false;
	                    break;
	                }
	                String currentPop = stack.pop();
	                if(s.equals("}") && !currentPop.equals("{")){
	                    res = false;
	                    break;
	                }
	                if(s.equals(")") && !currentPop.equals("(")){
	                    res = false;
	                    break;
	                }
	                if(s.equals("]") && !currentPop.equals("[")){
	                    res = false;
	                    break;
	                }
	            }
	        }

	        return res;
	    }
}

//enum Speed{
////	FAST(2);
////	FASTER(3);
////	SLOW(1);
//	
//	private final int speed;
//	
//	Speed(int speedCode){
//		this.speed = speedCode;
//	}
//}
