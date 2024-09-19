package com.aaa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class Demoservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //客户端：<a href="/demo">访问服务器端</a>
        System.out.printf("服务器被访问到了");
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }
}
