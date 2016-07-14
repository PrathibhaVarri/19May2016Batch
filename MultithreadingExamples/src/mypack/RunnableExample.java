package mypack;

class MyThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("child thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("First message in main thread");
		
		MyThread m=new MyThread();
		Thread childThread=new Thread(m);
		childThread.start();
		for(int i=1;i<=10;i++)
		{
		System.out.println("main thread");
		}

	}

}
