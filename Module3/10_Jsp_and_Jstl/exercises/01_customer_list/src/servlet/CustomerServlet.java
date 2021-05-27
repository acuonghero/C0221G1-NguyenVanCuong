package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ArrayList<Customer> customers =new ArrayList<>();

    @Override
    public void init() throws ServletException {

        customers.add(new Customer("Nguyen Van Cuong","12/12/2012","Đà Nẵng","https://i.pinimg.com/564x/92/bf/93/92bf93424e31623299e863d87a135c34.jpg"));
        customers.add(new Customer("Nguyen Van Nam","22/12/2012","Huế","https://anhdep123.com/wp-content/uploads/2020/11/hinh-nen-doremon.jpg"));
        customers.add(new Customer("Nguyen Van Hai","02/12/2012","Quảng Bình","https://i.pinimg.com/736x/74/07/1a/74071ade0fc711014bd3c43a0079feec.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customers);
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("/list/list.jsp");
        requestDispatcher.forward(request,response);
    }
}
