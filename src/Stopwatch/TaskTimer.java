package Stopwatch;

public class TaskTimer {
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();

		timer.start();
		readFileToString read = new readFileToString();
		String size = read.run();
		timer.stop();
		System.out.printf("%s\nRead %d chars in %.06f sec.\n", read.toString(), size.length(), timer.getElapsed());

		timer.start();
		readFileToStringBuilder read2 = new readFileToStringBuilder();
		String size2 = read2.run();
		timer.stop();
		System.out.printf("%s\nRead %d chars in %.06f sec.\n", read2.toString(), size2.length(), timer.getElapsed());

		timer.start();
		readFileToStringBuilder read3 = new readFileToStringBuilder();
		String size3 = read3.run();
		timer.stop();
		System.out.printf("%s\nRead %d chars in %.06f sec.\n", read3.toString(), size3.length(), timer.getElapsed());
	}

}
