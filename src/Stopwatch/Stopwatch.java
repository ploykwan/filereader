package Stopwatch;

public class Stopwatch {
	private static final double NANOSECCONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;

	public Stopwatch() {
		this.running = false;
		this.startTime = 0;
		this.stopTime = 0;
	}

	public void start() {
		if (!isRunning()) {
			this.running = true;
			this.startTime = System.nanoTime();
		}
	}

	public void stop() {
		if (isRunning()) {
			this.running = false;
			this.stopTime = System.nanoTime();
		}
	}

	public boolean isRunning() {
		return this.running;
	}

	public double getElapsed() {
		if (!isRunning()) {
			return (this.stopTime - this.startTime) * NANOSECCONDS;
		}
		return (System.nanoTime() - this.startTime) * NANOSECCONDS;
	}

//	public static void main(String[] arg) {
//		Stopwatch stopwatch = new Stopwatch();
//		stopwatch.start();
//		stopwatch.isRunning();
//		for (int i = 0; i < 5000; i++) {
//			int a = i;
//			System.out.println(stopwatch.getElapsed());
//		}
//		stopwatch.stop();
//		System.out.println(stopwatch.getElapsed());
//	}
}
