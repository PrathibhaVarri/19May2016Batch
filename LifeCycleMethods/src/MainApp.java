

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//applicationContext.registerShutdownHook();
		Employee employee = (Employee)applicationContext.getBean("employee");
		
		
		System.out.println(employee.getAddress().getCity());
		

	}

}
