package com.example.servlethome;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Locale;

@WebServlet(name = "Analyzer", value = "/Analyzer")
public class Analyzer extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("input_text");

        char[] charArray = str.toCharArray();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder punct = new StringBuilder();
        int vowelsCount = 0,
                consoCoutn = 0,
                punctCount = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if ((Character.toString((charArray[i])).toLowerCase(Locale.ROOT).matches("[aeiou]"))) {
                    vowels.append(charArray[i]).append(" ");
                    vowelsCount++;
                } else if ((Character.toString(charArray[i]).toLowerCase(Locale.ROOT).matches("[^aeiou]"))) {
                    consonants.append(charArray[i]).append(" ");
                    consoCoutn++;
                }
            } else {
                punct.append(charArray[i]).append(" ");
                punctCount++;
            }
        }

        String vowelsRes = "Vowels letters = " + vowelsCount + ": " + vowels;
        String consoRes = "Consonants letters = " + consoCoutn + ": " + consonants;
        String punctRes = "Punctuation marks, numbers and other = " + punctCount + ": " + punct;

        request.setAttribute("vowels", vowelsRes);
        request.setAttribute("conso", consoRes);
        request.setAttribute("punct", punctRes);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
