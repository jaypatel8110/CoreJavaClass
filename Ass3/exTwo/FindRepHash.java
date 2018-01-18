package com.jay.exTwo;

import java.util.HashSet;

public class FindRepHash {

	static char logic(char arr[]) {
		HashSet<Character> hash = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (hash.contains(c)) {
				return c;
			} else {
				hash.add(c);
			}

		}
		return '\0';
	}

	public static void main(String[] args) {
		String str = "Jaay Paatteel";
		char arr[] = str.toCharArray();
		System.out.println(logic(arr));
	}
}
