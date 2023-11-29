package practice_project2;

class A extends Thread{
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+ "is starting");

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"is done");
			notify();
		}
	}
}
public class ThreadSleepandWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A t1=new A();
		A t2=new A();

		t1.setName("X");
		t2.setName("Y");

		t1.start();

		synchronized(t1) {
			try {
				System.out.println(Thread.currentThread().getName()+" is Waiting for thread 1 to complete");
				t1.wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(Thread.currentThread().getName()+" is done waiting");
		}
		t2.start();
	}

}
