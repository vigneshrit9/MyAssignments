package week1.day3;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Amazon";
		int length = test.length();
		System.out.println("Lenth of the String: "+length);

		char[] charArray = test.toCharArray();
		System.out.println(charArray);

		for (int i =charArray.length-1;i>=0; i--) {
			System.out.print(charArray[i]);

		}




	}

}
