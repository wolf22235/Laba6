package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String header = request.getParameter("header");
        int rows = Integer.parseInt(request.getParameter("rows"));
        int columns = Integer.parseInt(request.getParameter("columns"));
        String color = request.getParameter("color");
        out.println("<html>");
        out.println("<head><title>"+header+"</title></head>");
        out.println("<body>");
        out.println("<h1>" + header + "</h1>");
        out.println("<table style='background-color:"+color+";'>");
        for (int i=0; i < rows; i++) {
            out.println("<tr>");
            for (int j=0; j < columns; j++) {
                out.println("<td>"+i+"/"+j+"</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }
}