package Medium;

import java.util.*;

public class Trie {
	public class TrieNode {
		Map<Character, TrieNode> children;
		boolean wordends;

		public TrieNode() {
			children = new HashMap<>();
			wordends = false;
		}
	}

	TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;
		for (char ch : word.toCharArray()) {
			TrieNode newchild = current.children.get(ch);
			if (newchild == null) {
				newchild = new TrieNode();
				current.children.put(ch, newchild);
			}
			current = newchild;
		}
		current.wordends = true;
	}

	public boolean search(String word) {
		TrieNode current = root;
		for (char ch : word.toCharArray()) {
			if (!current.children.containsKey(ch))
				return false;
			current = current.children.get(ch);
		}
		if (current.wordends)
			return true;
		return false;
	}

	public boolean startsWith(String prefix) {
		TrieNode current = root;
		for (char ch : prefix.toCharArray()) {
			if (!current.children.containsKey(ch))
				return false;
			current = current.children.get(ch);
		}
		return true;
	}
}
