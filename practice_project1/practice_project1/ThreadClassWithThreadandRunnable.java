package practice_project1;


	class A extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("Thread A:"+i);
			}
			
		}
		
	}
	
	class B implements Runnable{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("Thread B:"+i);
			}
		}
	}
	
	public class ThreadClassWithThreadandRunnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1 = new A();
        obj1.start();
		
		 B obj2 = new B();
	     Thread tB = new Thread(obj2);
	     tB.start();
		

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
	}

}
