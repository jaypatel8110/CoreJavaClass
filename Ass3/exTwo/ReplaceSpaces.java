package com.jay.exTwo;

public class ReplaceSpaces {
	static void logic(String str, int l) {
		char arr[] = str.toCharArray();
		int spaces = 0;
		for (int i = 0; i < l; i++) {
			if (arr[i] == ' ') {
				spaces++;
			}
		}
		int newLength = l + spaces * 2;
		char arrt[] = new char[newLength];
		for (int i = l - 1; i >= 0; i--) {
			if (arr[i] == ' ') {
				arrt[newLength - 1] = '0';
				arrt[newLength - 2] = '2';
				arrt[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				// System.out.println(chars[i]);
				arrt[newLength - 1] = arr[i];
				newLength = newLength - 1;
			}
		}
		System.out.println("Output String : " + String.valueOf(arrt));
	}

	public static void main(String[] args) {
		String str = "My name is Jay Patel";
		int l = str.length();
		System.out.println("Original String is " + str);
		logic(str, l);
	}

}
