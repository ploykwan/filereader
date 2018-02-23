package Stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Read text file, then collect text into String.
 * @author kwankaew
 *
 */
public class readFileToString implements Runnable{

	/**
	 * Read text file and collect into String variable.
	 * @return String from text.
	 */
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
	
	/**
	 * Explain what this class do
	 * @return the name of text and what program did.
	 */
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader, append to String.";
	}
}
