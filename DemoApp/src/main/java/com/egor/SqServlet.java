package com.egor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		
		int sum = (int) session.getAttribute("sum");
		int sq = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("The square of a number " +sum+ " is: " +sq);
	}
}
