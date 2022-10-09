package com.example.servlethome;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mathMethods.MathMethod;

import java.io.IOException;

@WebServlet(name = "MaxMinAvg", value = "/MaxMinAvg")
public class MaxMinAvg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double num1 = Double.parseDouble(request.getParameter("num1_field"));
        double num2 = Double.parseDouble(request.getParameter("num2_field"));
        double num3 = Double.parseDouble(request.getParameter("num3_field"));

//        response.getWriter().println("Get numbers: " + num1 + "; " + num2 + "; " + num3 + ".");
        String mathOperChoice = request.getParameter("math_radio");

        double result = 0;
        if (mathOperChoice.equals("max")) {
            result = MathMethod.getMaxValue(num1, num2, num3);
        } else if (mathOperChoice.equals("min")) {
            result = MathMethod.getMinValue(num1, num2, num3);
        } else if (mathOperChoice.equals("avg")) {
            result = MathMethod.getAverageValue(num1, num2, num3);
        }
//        HttpSession session = request.getSession();
//        session.setAttribute("result", result);
//        session.setAttribute("number_1", number_1);
//        session.setAttribute("number_2", number_2);
        request.setAttribute("res2", result);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
}