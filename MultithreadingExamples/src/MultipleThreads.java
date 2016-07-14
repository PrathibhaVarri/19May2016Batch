
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("child thread");
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class MultipleThreads {

	public static void main(String[] args) {
		System.out.println("First message in main thread");
		
		MyThread m=new MyThread();
		
		m.start();
		Thread childThread=new Thread(m);
		childThread.start();
		for(int i=1;i<=10;i++)
		{
		System.out.println("main thread");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}

	}

}
