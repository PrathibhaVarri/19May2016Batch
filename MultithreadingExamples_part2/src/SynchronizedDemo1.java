class MyClass implements Runnable
{
	SharedResources sr;
	MyClass(SharedResources sr)
	{
		this.sr=sr;
	}
	
	@Override
	public void run() {
		sr.m1();
		sr.m2();
	}
	
}

class SharedResources
{
	synchronized void m1()
	{
		System.out.println("m1 starts");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("m1 ends");
	}
	
	synchronized void  m2()
	{
		System.out.println("m2 starts");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("m2 ends");
	}
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {

		SharedResources sr=new SharedResources();
		MyClass m=new MyClass(sr);
		
		Thread childThread1=new Thread(m);
		childThread1.start();
		
		Thread childThread2=new Thread(m);
		childThread2.start();
		
	}

}
