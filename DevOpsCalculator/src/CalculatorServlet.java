
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String number1Str = request.getParameter("num1");
		System.out.print("Test" + number1Str);
		float number1 = Float.parseFloat(number1Str);

		String number2Str = request.getParameter("num2");
		float number2 = Float.parseFloat(number2Str);

		String calculationType = request.getParameter("select");

		if (calculationType.equals("add")) {
			out.print("Result: " + addNumbers(number1, number2));

		} else if (calculationType.equals("subtract")) {
			out.print("Result: " + subtractNumbers(number1, number2));

		} else if (calculationType.equals("multiply")) {
			out.print("Result: " + multiplyNumbers(number1, number2));
			
		} else if (calculationType.equals("divide")) {
			out.print("Result: " + divideNumbers(number1, number2));
		}
	}

	public float addNumbers(float number1, float number2) {
		return number1 + number2;
	}

	public float subtractNumbers(float number1, float number2) {
		return number1 - number2;
	}

	public float multiplyNumbers(float number1, float number2) {
		return number1 * number2;
	}

	public float divideNumbers(float number1, float number2) {
		return number1 / number2;
	}

}
