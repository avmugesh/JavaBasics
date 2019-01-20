package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter file = new PrintWriter("demo.txt");
		file.write("Line1");
		file.write("Line2");
		file.write("Line3");
		file.close();
	}

}
