package array;
import java.util.ArrayList;

import java.util.Random;

public class Usearray {

	public static void main(String[] args) {
		Random cl = new Random();
		int [] arrayofNum = new int[10];
		ArrayList<Integer> sami = new ArrayList<>();
		sami.size();
		System.out.println(80);
		
		for (int i=0; i<arrayofNum.length; i++) {
			arrayofNum[i] =((Random) cl).nextInt(500);
			
		}
		for(int j=0; j<arrayofNum.length; j++) {
			System.out.println(arrayofNum[j]);
		}
		for(int b=0; b<arrayofNum.length; b++) {
			System.out.println(arrayofNum[b]);
		}
		for(int d=7; d<arrayofNum.length; d++) {
			System.out.println(arrayofNum[d]);
		}
		int[] arrayofLand = new int[60];
		for(int l=20; l<arrayofLand.length; l++) {
			arrayofLand[l] = cl.nextInt(600);
		}
		
		for(int s=0; s<arrayofLand.length; s++) {
			System.out.println(arrayofLand[s]);
			
		}
	}

}
