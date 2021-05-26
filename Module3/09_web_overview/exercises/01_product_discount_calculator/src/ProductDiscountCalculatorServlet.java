import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ProductDiscountCalculatorServlet", value = "/calculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("product-description");
        float listPrice = Float.parseFloat(request.getParameter("list-price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount-percent"));
        double discountAmount = listPrice * discountPercent * 0.01;

        request.setAttribute("result",discountAmount);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
