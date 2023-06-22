package week1.day3;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Day3SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		//2,3,4,6,7,11
		Arrays.sort(data);
		int length = data.length;
		
		for (int i = 0; i < data.length; i++) {
			if (data[length-2]<data[length-1]) {
				
				System.out.println("Second largest "+ data[length-2]);
				
			}
			
		}
	}

}
