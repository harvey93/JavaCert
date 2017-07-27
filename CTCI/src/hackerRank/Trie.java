package hackerRank;

import java.util.HashMap;

public class Trie{

	TrieNode head = new TrieNode(null);
	
	public void addNode(String str){
		TrieNode node = getNode(str, head);
		System.out.println(node);
	}
	
	public TrieNode getNode(String str, TrieNode node){
		if(str.length() == 0){
			return node;
		}
		TrieNode res = node;
		TrieNode newNode = getNode(node, str.charAt(0));
		if(newNode != null){
			res = getNode(str.substring(1, str.length() - 1), newNode);
		}
		return res;
	}
	
	private TrieNode getNode(TrieNode node, Character c){
		TrieNode res = null;
		if(node.children.containsKey(c)){
			res = node.children.get(c);
		}
		return res;
	}
	
}

class TrieNode{
	Character data;
	boolean isCompleteWord = false;
	HashMap<Character, TrieNode> children = new HashMap<>();
	
	public TrieNode(Character data){
		this.data = data;
	}
	
	public String toString(){
		if(this.data == null){
			return "null";
		}
		return data.toString();
	}
}
