package ch8;
import java.util.*;

public class Coins {

	
	public static long makeChangeDP (int amount){
		int coins[] = {25, 10, 5, 1};
		HashMap<String, Long> map = new HashMap<>();
		return makeChangeDP(coins, amount, 0, map);

	}
	
	public static long makeChangeDP(int[] coins, int money, int index, HashMap<String, Long> map){
		
		if(money == 0){
			return 1;
		}
		
		if(index >= coins.length){
			return 0;
		}
		
		
		String key = money + "-" + index;
		if(map.containsKey(key)){
			return map.get(key);
		}
		int amountWithCoin = 0;
		long ways = 0;
		while(amountWithCoin <= money){
			
			int remaining = money - amountWithCoin;
			ways += makeChangeDP(coins, remaining, index + 1, map);
			amountWithCoin += coins[index];
		}
		
		map.put(key, ways);
		
		return map.get(key);
	}

	
	
	
	public static long makeChangeHR(int[] coins, int money, int index){
		
		if(money == 0){
			return 1;
		}
		
		if(index >= coins.length){
			return 0;
		}
		
		
		
		int amountWithCoin = 0;
		long ways = 0;
		while(amountWithCoin <= money){
			
			int remaining = money - amountWithCoin;
			ways += makeChangeHR(coins, remaining, index + 1);
			amountWithCoin += coins[index];
		}
		
		return ways;
	}

	
	
	public static int makeChange(int amt){
		int denoms[] = {25, 10, 5, 1};
		return makeChange(amt, denoms, 0);
	}
	
	
	
	public static int makeChange(int amt, int[] denoms, int index){
		if(index >= denoms.length - 1){
			return 1;
		}
		
		int ways = 0;
		int denomAmt = denoms[index];
		
		for(int i = 0; amt - i * denomAmt >= 0; i++){
			int remainder = amt - i * denomAmt;
			ways += makeChange(remainder, denoms, index + 1);
		}
		
		return ways;
	}
	
//	public static int makeChange(int amt){
//		if(amt == 0){
//			
//			return 1;
//		}
//		
//		if(amt < 0){
//			return 0;
//		}
//		
//				
//		return makeChange(amt - 25) + makeChange(amt - 10) + makeChange(amt - 5) + makeChange(amt - 1);
//	}
	
//	public static int makeChange(int amt, int[] denoms, int index){
//		if(index >= denoms.length - 1){
//			return 1;
//		}
//		
//		int denomAmt = denoms[index];
//		
//		int ways = 0;
//		
//		for(int i = 0; i * denomAmt <= amt; i++){
//			int remainder = amt - i * denomAmt;
//			ways += makeChange(remainder, denoms, index + 1);
//		}
//		
//		return ways;
//	}
}
