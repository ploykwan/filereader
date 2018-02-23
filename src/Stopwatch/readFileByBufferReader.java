package Stopwatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class readFileByBufferReader implements Runnable {
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

	public String toString() {
		return "Reading Alice-in-Wonderland.txt using BufferReader, append line to String.";
	}
	// public static void main(String[] arg) {
	// Stopwatch stopwatch = new Stopwatch();
	//
	// stopwatch.start();
	// String alice = readFileToString("./Alice-in-Wonderland.txt");
	// stopwatch.stop();
	//
	// System.out.printf("Read %d chars in %.02f sec.", alice.length(),
	// stopwatch.getElapsed());
	// }
}
