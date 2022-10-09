package com.example.servlethome;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import mathMethods.MathMethod;

import java.io.IOException;

@WebServlet(name = "MaxOfThree", value = "/MaxOfThree")
public class MaxOfThree extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double num1 = Double.parseDouble(request.getParameter("n1_field"));
        double num2 = Double.parseDouble(request.getParameter("n2_field"));
        double num3 = Double.parseDouble(request.getParameter("n3_field"));

        double result = 0;
//        response.getWriter().println("Get numbers: " + num1 + "; " + num2 + "; " + num3 + ".");
        result = MathMethod.getMaxValue(num1,num2,num3);


        request.setAttribute("res1", result);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
//        response.getWriter().println("Получены числа: " + num1 + "; " + num2 + "; " + num3 + ".");
//        response.getWriter().println("Максимум: " + MathMethod.getMaxValue(num1,num2,num3));

    }
}
