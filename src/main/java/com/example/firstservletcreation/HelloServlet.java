package com.example.firstservletcreation;

import com.example.firstservletcreation.somePackage.Cart;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello user!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
//        Integer count = (Integer) session.getAttribute("count");
//        if (count == null) {
//            count = 1;
//            session.setAttribute("count", count);
//        } else {
//            session.setAttribute("count", count + 1);
//        }

        Cart cart = (Cart) session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);





//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("<h2>" + " Your count is " + count + "</h2>");
//        out.println("</body></html>");


    }

    public void destroy() {
    }
}