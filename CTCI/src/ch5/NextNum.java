package ch5;

public class NextNum {
	
	public static int getNext(int n){
		return n;
	}
	
	public static int getNextLargest(int n){
		String s = Integer.toBinaryString(n);
		int p = findFirstNonTrailingZero(s);
		System.out.println(s);
		System.out.println(p);
		
		return n;
	}
	
	public static int findFirstNonTrailingZero(String s){
		boolean b = false;
		int res = s.length() - 1;
		for(; res >= 0; res--){
			char c = s.charAt(res);
			if(!b && c == '1'){
				
				b = true;
			}
			if(b && c == '0'){
				break;
			}
		}
		return s.length() - 1 - res;
	}
	
	public static int getNextSmallest(int n){
		return n;
	}

}
