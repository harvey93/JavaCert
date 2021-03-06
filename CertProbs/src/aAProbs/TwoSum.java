package aAProbs;

import java.util.*;


public class TwoSum {
	
	public static ArrayList<ArrayList<Integer>> sum(ArrayList<Integer> arr){
		ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < arr.size() - 1; i++) {
			for(int j = i + 1; j < arr.size(); j++){
				if(arr.get(i) + arr.get(j) == 0){
					ArrayList<Integer> indices = new ArrayList<Integer>();
					indices.add(i);
					indices.add(j);
					res.add(indices);
				}
			}
		}
		
		return res;
	}
	
	public static ArrayList<ArrayList<Integer>> sumFast(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.size(); i++) {
			Integer target = - arr.get(i);
			if(map.containsKey(target)){
				ArrayList<Integer> indices = new ArrayList<Integer>();
				indices.add(map.get(target));
				indices.add(i);
				res.add(indices);
			}
			map.put(arr.get(i), i);
		}
		
		return res;
	}
}
