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
@WebServlet("/ChangPassword")
public class ChangPassword  extends HttpServlet
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	  HttpSession session = req.getSession(false);
	  RequestDispatcher dispatcher = null;
	  String password =  req.getParameter("password");
	  String npassword = req.getParameter("npassword");
	  String cpassword = req.getParameter("cpassword");
	  String uidno=  req.getParameter("uid");
	  
	  BankingSystemHibernateImp imp = new BankingSystemHibernateImp();
	  boolean bean = imp.ChangPassword(password,npassword,uidno);
      if(bean) {
        req.setAttribute("info", "Your password has sussessfuly change!!!");
      }
      else {
        req.setAttribute("info", " OOps!!!!!! You enterd Wrong pssword");
       }
      if(imp!=null) {
    	  //	HttpSession session2 = req.getSession(true);
        	//session2.setAttribute("sss", bean);
    	  dispatcher=req.getRequestDispatcher("/ChangPassword.jsp");
    	  dispatcher.forward(req, resp);
        }
  }
}
