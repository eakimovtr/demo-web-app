package com.egor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int sum = 0;
		
		Cookie[] cookies = req.getCookies();
		for ( Cookie cookie : cookies ) {
			if (cookie.getName().equals("sum")) {
				sum = Integer.parseInt(cookie.getValue());
			}
		}
		
		int sq = sum * sum;
		
		PrintWriter out = res.getWriter();
		out.println("The square of a number " +sum+ " is: " +sq);
	}
}
