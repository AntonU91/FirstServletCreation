package com.example.firstservletcreation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet()
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  double idValue =  Math.random( )*10000;
        Cookie cookie = new Cookie("some_id", "133");
        Cookie cookie1 = new Cookie("another_id", "432335");
        cookie.setMaxAge(24*60*60);
        cookie1.setMaxAge(24*60*60);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);

    }
}
