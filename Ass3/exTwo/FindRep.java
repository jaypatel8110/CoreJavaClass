package com.jay.exTwo;

public class FindRep {
	//Also tryed another this example with Hashset
	static Character logic(String str) {
		char r = 0;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					r = arr[i];
					break;
				}
			}
			if (r != 0) {
				break;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		String str = "twwo mto wot";
		Character c = logic(str);
		if (c == 0) {
			System.out.println("No match");
		} else {
			System.out.println("first match is " + c);
		}

	}

}
