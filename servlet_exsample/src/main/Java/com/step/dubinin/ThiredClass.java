package com.step.dubinin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThiredClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Hailo Dear</h1>\n" +
                "<form action=\"/shop2\" method=\"get\">\n" +
                "    <input type=\"submit\" value=\"go to third page\">\n" +
                "</body>\n" +
                "</html>");
    }
}
