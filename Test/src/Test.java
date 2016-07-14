class MyThread extends Thread
{
	MyThread()
	{}
	MyThread(Runnable r)
	{
		super(r);
	}
	public void run()
	{
		System.out.println("MyThread");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable");
	}
}

public class Test {

	public static void main(String[] args) {
		
		new MyThread().start();
		
		new MyThread(new MyRunnable()).start();
		
		new Thread(new MyRunnable()).start();
		
		
	}

}
