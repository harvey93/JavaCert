package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
//		double []medians = RunningMedian.getMedians(new int []{1,2,3,4,5,6,7,8,9});
		Trie  trie = new Trie();
		trie.addString("hrant");
		trie.addString("hrazdan");
		System.out.println(trie.getChar('h'));
	}
}


