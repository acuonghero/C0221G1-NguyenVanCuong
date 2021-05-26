import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculator")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("product-description");
        float listPrice = Float.parseFloat(request.getParameter("list-price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount-percent"));
        double discountAmount = listPrice * discountPercent * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Product description" + productDescription + "</h1>");
        writer.println("<h1>List price" + listPrice + "</h1>");
        writer.println("<h1>Discount percent" + discountPercent + "</h1>");
        writer.println("<h1>Discount amount" + discountAmount + "</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
