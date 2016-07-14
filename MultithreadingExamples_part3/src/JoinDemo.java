class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run");
	}
	
	
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread m=new MyThread();
		MyThread.t=Thread.currentThread();
		m.start();
		Thread.sleep(10000);
		System.out.println("main");

	}

}
