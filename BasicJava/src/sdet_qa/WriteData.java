package sdet_qa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("E:\\Annniiii\\Test1223.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Aniket i deshmukh");
		bw.write("aniiii");
		System.out.println("Finishesddddd!!!!");
		
		bw.close();
	}

}
