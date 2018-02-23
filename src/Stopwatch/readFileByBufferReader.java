package Stopwatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Read text file by bufferedReader, then collect text into String.
 * @author kwankaew
 *
 */
public class readFileByBufferReader implements Runnable {
	
	/**
	 * Read text file as a line collect into String variable.
	 * @return String from text.
	 */
	@Override
	public String run() {
		FileReader reader = null;
		try {
			reader = new FileReader("./Alice-in-Wonderland.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		BufferedReader br = new BufferedReader(reader);
		String result = "";
		String line;
		try {
			while ( (line = br.readLine()) != null ) {
				result = result + line + '\n';
			}
		} catch (IOException e1) {
			
		}
		if( br != null )
			try {
				br.close();
			} catch (IOException e) {
				
			}
		return result;
	}
	
	/**
	 * Explain what this class do
	 * @return the name of text and what program did.
	 */
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using BufferReader, append line to String.";
	}
	
}
