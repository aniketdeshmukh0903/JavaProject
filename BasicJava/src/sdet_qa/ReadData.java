package sdet_qa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File file = new File("E:\\Annniiii\\aniik.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextInt());
		}
		

	}

}
