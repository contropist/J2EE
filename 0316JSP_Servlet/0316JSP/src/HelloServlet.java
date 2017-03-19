import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HelloServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int a=Integer.parseInt(request.getParameter("va"));	
		int b=Integer.parseInt(request.getParameter("vb"));	
		//String sb=request.getParameter("vb");	
		String fuhao=request.getParameter("xuanze");
		if("+".equals(fuhao)){
			request.setAttribute("zhi",Integer.toString(a+b));
		}
		else if("-".equals(fuhao)){
			request.setAttribute("zhi",Integer.toString(a-b));
		}
		else if("*".equals(fuhao)){
			request.setAttribute("zhi",Integer.toString(a*b));
		}
		else if(("/".equals(fuhao)) && (b!=0)){
			request.setAttribute("zhi",Integer.toString(a/b));
		}else{
			request.setAttribute("zhi"," ‰»Î¥ÌŒÛ£°");
		}
		request.getRequestDispatcher("../b.jsp").forward(request,response); 
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
