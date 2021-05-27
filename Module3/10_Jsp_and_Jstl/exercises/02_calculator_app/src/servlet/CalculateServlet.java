package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float result = 0;
        try {
            float first = Float.parseFloat(request.getParameter("first"));
            float second = Float.parseFloat(request.getParameter("second"));
            String chosse = request.getParameter("chosse");

            switch (chosse) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    try {
                        if (second == 0) {
                            throw new Exception("Lỗi chia cho 0");
                        }
                        result = first / second;
                    } catch (Exception e) {
                        request.setAttribute("resultCalculate", e.getMessage());
                        request.getRequestDispatcher("/calculate/calculate.jsp").forward(request, response);
                    }
            }
        }
        catch (Exception e) {
            request.setAttribute("resultCalculate", e.getMessage());
            request.getRequestDispatcher("/calculate/calculate.jsp").forward(request, response);
        }


        request.setAttribute("resultCalculate", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calculate/calculate.jsp");
        requestDispatcher.forward(request, response);
    }
}
