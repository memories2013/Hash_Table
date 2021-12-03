package com.hash;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "To be or not to be";
		
		HashTable hash = new HashTable(6);
		hash.countWords(str);
		
	}

}