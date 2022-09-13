package com.revature.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gameservlet")
public class GameServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.sendRedirect("game.html");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("Hello "+request.getParameter("username"));
		System.out.println(request.getParameter("username"));
	}
}
