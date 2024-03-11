/**
 * 
 */
package advancejavaproj2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */

public class LoginServlet extends HttpServlet {
	long counter;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside the Do get method");
		
		System.out.println(counter++);
	}

	@Override
	public void destroy() {
		System.out.println("Inside Destory");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside INIT");
	}

}
