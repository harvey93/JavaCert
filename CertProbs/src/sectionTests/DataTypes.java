package sectionTests;

import aAProbs.sumNums;

public class DataTypes implements A{

	char c;
	static int y = 10;
	
	public void charTest(){
		System.out.println(c);
	}
	
	public void localVarTest(){
		int y = 5;
		final int x;
		x = 10;
		System.out.println(x + y);
		
	}
	
	public void truthTest(){
		int y;
		if(go(10)){
			y = 3;
		} 
		
	}
	
	public void interfaceTest(){
		System.out.println(this.s);
	}
	
	public void truthTest2(){
		boolean f = true;
		if(true){
			f = false;
		}else {
			f = true;
		}
		
		System.out.println(f); 
	}
	

	
	public boolean go(int y){
//		if( y > 5){
//			return true;
//		}else{
//			return false;
//		}
		return true;
	}
}
