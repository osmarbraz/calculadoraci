package com.calculadoraci;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CtrCalculadora", urlPatterns = {"/servlet/CtrCalculadora"})
public class CtrCalculadora extends HttpServlet {
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try ( PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>Calculadora</title></head><body>");
            out.println("<h1>Calculadora</h1>");

            // Instancia o objeto Calculadora
            Calculadora calculadora = new Calculadora();
            calculadora.setValorA(Double.parseDouble(request.getParameter("ValorA")));
            calculadora.setValorB(Double.parseDouble(request.getParameter("ValorB")));

            if (request.getParameter("operacao").equals("adicao")) {
                out.print("A soma de " + calculadora.getValorA() + " + " + calculadora.getValorB() + " = " + calculadora.getSoma() + " <p>");
            } else {
                if (request.getParameter("operacao").equals("subtracao")) {
                    out.print("A diferença de " + calculadora.getValorA() + " - " + calculadora.getValorB() + " = " + calculadora.getDiferenca() + " <p>");
                } else {
                    if (request.getParameter("operacao").equals("multiplicacao")) {
                        out.print("O produto de " + calculadora.getValorA() + " * " + calculadora.getValorB() + " = " + calculadora.getProduto() + " <p>");
                    } else {
                        if (request.getParameter("operacao").equals("divisao")) {
                            out.print("O quociente de " + calculadora.getValorA() + " / " + calculadora.getValorB() + " = " + calculadora.getQuociente() + " <p>");
                        }
                    }
                }
            }
            out.print("<a href=\"" + request.getContextPath() + "/FrmCalculadora.jsp\"> Novo cálculo </a><p></body></html>");
        }
    }
}
