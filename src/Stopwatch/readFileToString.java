package Stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class readFileToString implements Runnable{

	@Override
	public String run() {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream("./Alice-in-Wonderland.txt");
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while ((c = reader.read()) >= 0) {
				data = data + (char) c;
			}

		} catch (IOException e) {
			System.out.println("File not found");
		}
		if (in != null)
			try {
				in.close();
			} catch (IOException e) {
			}
		return data;
		
	}
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader, append to String.";
	}
}
