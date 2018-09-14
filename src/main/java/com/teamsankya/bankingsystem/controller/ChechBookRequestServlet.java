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
import com.teamsankya.bankingsystem.dto.AccountHolderBean;
import com.teamsankya.bankingsystem.dto.ServiceTrackerBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;
@WebServlet("/RequestCheckBook")
public class ChechBookRequestServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session= req.getSession(false);
	
	RequestDispatcher dispatcher = null;
	String descripition= req.getParameter("descripition");
	
	ServiceTrackerBean bean = new ServiceTrackerBean();
	bean.setS_description(descripition);
	
	UserInfoBean user=(UserInfoBean) session.getAttribute("sss");
	//System.out.println(user.getAccountno());
	bean.setBean(user);
	
	BankingSystemHibernateImp imp = new BankingSystemHibernateImp();
	int sid=imp.requestCheckBook(bean);
	req.setAttribute("info", sid);
	req.setAttribute("msg","your service request execpted..!");
	if(sid>0) {
		dispatcher= req.getServletContext().getRequestDispatcher("/ChackBookRequest.jsp");
    	dispatcher.forward(req, resp);
	}
	
}
}
	
	

	

