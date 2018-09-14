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
import com.teamsankya.bankingsystem.dto.UserInfoBean;
@WebServlet("/ChangMobileno")
public class ChangMobilenoServlet extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	          HttpSession session = req.getSession(false);
	          RequestDispatcher dispatcher = null;
	         /* String Password= req.getParameter("password");
	          String nPassword= req.getParameter("npassword");
	          String cPassword= req.getParameter("cpassword");*/
	          String  nMobileNo = req.getParameter("Mobileno");
	          String  uid = req.getParameter("uid");
	          
	          
	          BankingSystemHibernateImp  imp = new BankingSystemHibernateImp();
	          Boolean m1;
	        /*  if(Password!=null&&nPassword!=null&&cPassword!=null) {
	          bean = imp.ChangPassword(Password, nPassword, cPassword);
	          }
	         else {*/
	        	  
	          
	          if(nMobileNo!=null) {
	          m1 = imp.ChangMobileno(nMobileNo,uid);
	          }
	          else {
	        	  
	          }
	          
}

}

