import org.springframework.beans.factory.annotation.Autowired;

public class Employee {//implements InitializingBean,DisposableBean{
    @Autowired
	Address address;
	
	
	/*@Override
	public void destroy() throws Exception {
		System.out.println("From destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From after properties set");
		
	}*/
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void init()
	{
		System.out.println("From init");
	}
	
	public void destroy()
	{
		System.out.println("From destroy");
	}

}
