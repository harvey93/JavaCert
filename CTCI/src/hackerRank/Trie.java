package hackerRank;

import java.util.HashMap;

public class Trie {

	private TrieNode head;
	
	public Trie(){
		this.head = new TrieNode(null);
	}
	
	public void addChar(char c){
		
	}
	
	private void addChar(TrieNode node, char c){
		
	}
}

class TrieNode{
	Character data;
	HashMap<Character, TrieNode> children;
	boolean isWord;
	
	public TrieNode(Character data){
		this.children = new HashMap<>();
		this.data = data;
	}
	
	public String toString(){
		if(data == null){
			return "null";
		}
		return data.toString();
	}
}
