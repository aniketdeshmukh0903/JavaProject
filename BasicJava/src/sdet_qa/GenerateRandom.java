package sdet_qa;

import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		Random r=new Random();
		int r_int=r.nextInt(1000);
		System.out.println(r_int);
		
	}

}
