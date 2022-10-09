package com.example.servlethome;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Calculator", value = "/Calculator")
public class Calculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1_calc"));
        double num2 = Double.parseDouble(request.getParameter("num2_calc"));

        String select = request.getParameter("operation");
        double result = 0;
        switch (select) {
            case "sum":
                result = num1 + num2;
                break;
            case "diff":
                result = num1 - num2;
                break;
            case "mult":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
            case "exp":
                result = Math.pow(num1, num2);
                break;
            case "perc":
                result = (num1 / num2) * 100;
                break;
        }

        request.setAttribute("res3", result);
        getServletContext().
                getRequestDispatcher("/index.jsp").
                forward(request, response);
    }
}
