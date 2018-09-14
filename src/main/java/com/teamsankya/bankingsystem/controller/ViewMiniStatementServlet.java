package com.teamsankya.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamsankya.bankingsystem.dao.BankingSystemHibernateImp;
import com.teamsankya.bankingsystem.dto.TransationBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;
@WebServlet("/ViewMiniStatment")
public class ViewMiniStatementServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session= req.getSession(false);
		RequestDispatcher dispatcher= null;
		String  accno=req.getParameter("acno");
		
		 BankingSystemHibernateImp  hibernateImp = new BankingSystemHibernateImp();
	        TransationBean transinfo =   hibernateImp.ViewMiniStatmennt(accno);
	        System.out.println(transinfo.getTran_amount());
	        req.setAttribute("info", transinfo);
	        dispatcher= req.getServletContext().getRequestDispatcher("/ViewMiniStatment.jsp");
	    	dispatcher.forward(req, resp);

}
}
