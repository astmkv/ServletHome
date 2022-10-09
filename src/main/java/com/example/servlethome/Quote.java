package com.example.servlethome;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Quote", value = "/ViewQuote")
public class Quote extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {;
        request.getServletContext().getRequestDispatcher("/quote.jsp").forward(request,response);


    }

}
