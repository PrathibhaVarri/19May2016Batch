

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
       System.out.println("From constructor");
    }
    
    public void init()
    {
    	System.out.println("init with zero parameter");
    }
    
    public void init(ServletConfig config)
    {
    	System.out.println("init with config parameter");
    }
    
    public void service(ServletRequest request,ServletResponse response)
    {
    	System.out.println("Generic service");
    	
    }
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
    	System.out.println("Http service");
    	
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("From doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("from doPost");
	}
	
	public void destroy()
	{
		System.out.println("From destroy");
		
	}

}
