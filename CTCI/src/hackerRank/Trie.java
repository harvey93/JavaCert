package hackerRank;

import java.util.HashMap;

public class Trie {

	private TrieNode head;
	
	public Trie(){
		this.head = new TrieNode(null);
	}
	
	
	public void addString(String str){
		int i = 0;
		TrieNode current = head;
		while(i < str.length()){
			Character c = str.charAt(i);
			if(current.children.containsKey(c)){
				current = current.children.get(c);
			}else {
				current = addNode(current, c);
			}
	
			i++;
			
		}
	}

	
	private TrieNode addNode(TrieNode node, char c){
		TrieNode newNode = new TrieNode(c);
		node.children.put(c, newNode);
		return newNode;
	}
	
	public String toString(){
		return head.toString();
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
			return "Data: null | Children: " + children.toString();
		}
		return "Data: " + data.toString() + " Children: " + children.toString();
	}
}
