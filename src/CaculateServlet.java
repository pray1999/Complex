import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import beans.Complex;
 
/**
 * Servlet implementation class CaculateServlet
 */
@WebServlet("/caculateServlet")
public class CaculateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double r1=Double.parseDouble(request.getParameter("r1"));
		double i1=Double.parseDouble(request.getParameter("i1"));
		double r2=Double.parseDouble(request.getParameter("r2"));
		double i2=Double.parseDouble(request.getParameter("i2"));
		Complex c1=new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);
		String result=c1.add(c2).toString();
		request.setAttribute("outputMessage", result);
		request.getRequestDispatcher("output.jsp").forward(request, response);;
	}
 
}