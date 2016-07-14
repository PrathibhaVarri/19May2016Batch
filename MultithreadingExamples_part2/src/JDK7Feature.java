
public class JDK7Feature {
	
	public static void main(String[] args) {
		Runnable r=new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
			
		};
		Thread t=new Thread();
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		
		Runnable r1=()->
		{
			System.out.println(Thread.currentThread().getName());
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		
		Runnable r2=()->System.out.println(Thread.currentThread().getName());
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}
