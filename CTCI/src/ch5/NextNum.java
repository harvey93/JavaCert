package ch5;

public class NextNum {
	
	public static int getNextSmallest(int n){
		String s = Integer.toBinaryString(n);
		int p = findFirstNonTrailingOne(s);
		int flipped = setBit(n, p);
		
		System.out.println(Integer.toBinaryString(flipped));
//		System.out.println(Integer.toBinaryString(n));
		return n;
	}
	
	public static int findFirstNonTrailingOne(String s){
		boolean b = false;
		int res = s.length() - 1;
		for(; res >= 0; res--){
			char c = s.charAt(res);
			if(!b && c == '0'){
				
				b = true;
			}
			if(b && c == '1'){
				break;
			}
		}
		return s.length() - 1 - res;
	}

	
	public static int getNextLargest(int n){
		String s = Integer.toBinaryString(n);
		int p = findFirstNonTrailingZero(s);
		int flipped = setBit(n, p);
		int ones = 0;
		
		for(int i = s.length() - p + 1; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				ones++;
			}
		}
		int clearMask = ~0 << p;
		int cleared = flipped & clearMask;
		
		int insertMask = (1 << ones) - 1;
		
		
		return cleared | insertMask;
	}
	
	public static int setBit(int n, int p){
		int mask = 1 << p;
		return n | mask;
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
	

}
