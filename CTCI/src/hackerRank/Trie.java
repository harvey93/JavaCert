package hackerRank;

import java.util.HashMap;

public class Trie<T> {

	TrieNode<T> head = new TrieNode<T>();
}

class TrieNode<T>{
	T data;
	boolean isCompleteWord = false;
	HashMap<T, TrieNode> children = new HashMap<>();
}
