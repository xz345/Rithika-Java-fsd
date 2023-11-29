package practice_project3;



class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}


	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}

public class ThreadSynchronization {	   
	public static void main(String[] args) {
		Counter counter = new Counter();


		Thread incrementThread = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		});

		Thread decrementThread = new Thread(() -> {
			for (int i = 0; i < 9000; i++) {
				counter.decrement();
			}
		});

		incrementThread.start();
		decrementThread.start();

		try {
			incrementThread.join();
			decrementThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("Final Count: " + counter.getCount());
	}
}

