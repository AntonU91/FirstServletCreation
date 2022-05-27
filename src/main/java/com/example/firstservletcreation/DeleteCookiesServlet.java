package com.example.firstservletcreation;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Cookie cookie = new Cookie("some_id", "");
       cookie.setMaxAge(0);
       Cookie cookie1 = new Cookie("another_id", "");
       cookie1.setMaxAge(0);
       response.addCookie(cookie1);
        response.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
