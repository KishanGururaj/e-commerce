package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/final")
public class FinalServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mobileName=(String) req.getAttribute("nm");
		String quantity=(String) req.getAttribute("quan");
		int amount =(Integer.parseInt(quantity))*54000;
		PrintWriter printwriter=resp.getWriter();
		printwriter.print("Thanks for shooping "+amount);
		
		
		
	}

}
