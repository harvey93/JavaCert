package ch8;
import java.util.*;

public class Sets {
	
	public static ArrayList<ArrayList<Integer>> perms(ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if(list.size() <= 1){
			res.add(list);
			return res;
		}
		
		Integer last = list.remove(list.size() - 1);
		ArrayList<ArrayList<Integer>> prevPerms = perms(list);
		for(ArrayList<Integer> sub : prevPerms){
			for(int i = 0; i < sub.size(); i++){
				ArrayList<Integer> newSub = (ArrayList<Integer>) sub.clone();
				newSub.add(last);
			}
		}
		
	}
	
	
	public static ArrayList<ArrayList<Integer>> subSets(ArrayList<Integer> list){
		if(list.size() == 0){
			ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
			res.add(new ArrayList<Integer>());
			return res;
		}
		
		Integer last = list.remove(list.size() - 1);
		
		
		ArrayList<ArrayList<Integer>> prevList = subSets(list);
		ArrayList<ArrayList<Integer>> newSubs = new ArrayList<>();
		
		for(ArrayList<Integer> prevSub : prevList){
			ArrayList<Integer> sub = new ArrayList<>();
			for(Integer s : prevSub){
				sub.add(s);
			}
			newSubs.add(sub);
		}
		
		
		for(ArrayList<Integer> sub : newSubs){
			sub.add(last);
		}
		for(ArrayList<Integer> newSub : newSubs){
			prevList.add(newSub);
		}
		
		
		return prevList;
	}

}
