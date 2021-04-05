package com.wolken.wolkenapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/product" , loadOnStartup = +1)
public class ProductServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mobileName=req.getParameter("nm");
		String quantity=req.getParameter("quan");
		req.setAttribute("nm", mobileName);
		req.setAttribute("quan",quantity);
		RequestDispatcher dispatcher=req.getRequestDispatcher("final");
		dispatcher.forward(req, resp);
	}


}
