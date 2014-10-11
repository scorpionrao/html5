package headfirst.networkandthreads;

public class RunThreads implements Runnable {

	public static void main(String[] args) {
		RunThreads runner = new RunThreads();
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);
		alpha.setName("Alpha Thread");
		beta.setName("Beta Thread");
		alpha.start();
		beta.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + 
					" is running");
		}
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + 
					" is running");
		}
	}

}
