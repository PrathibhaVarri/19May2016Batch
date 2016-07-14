
class Parent
{
   void show()
   {
	   System.out.println("From parent");
   }
}

class Child extends Parent
{
   void show()
   {
	   super.show();
	   System.out.println("From child");
   }
}


public class Test extends Child {
	
	public static void main(String[] args) {
		Child obj=new Child();
		
		obj.show();
	}

}
