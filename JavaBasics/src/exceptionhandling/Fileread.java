package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Ganesh\\Desktop\\file.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
	
		System.out.println(br.readLine());
		
		br.close();
	}

}
