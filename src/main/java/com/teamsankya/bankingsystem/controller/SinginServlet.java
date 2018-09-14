package com.teamsankya.bankingsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.event.internal.DirtyCollectionSearchVisitor;

import com.teamsankya.bankingsystem.dao.BankingSystemHibernateImp;
import com.teamsankya.bankingsystem.dto.CustmerIdBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;
@WebServlet("/SingIn")
public class SinginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session= req.getSession(false);
		
		 RequestDispatcher  dispatcher = null;
		 String  uid=req.getParameter("uid");
		 String Password= req.getParameter("password");
		 
	
        BankingSystemHibernateImp  hibernateImp = new BankingSystemHibernateImp();
        UserInfoBean infoBean =   hibernateImp.Singin(uid, Password);
       
   
       if(infoBean != null)
       {
    	   HttpSession hsp = req.getSession(true);
    	   hsp.setAttribute("sss", infoBean);
    	  dispatcher = req.getRequestDispatcher("/SingIn.jsp");
    	  dispatcher.forward(req, resp);
    	  
       }
       else {
    	   dispatcher= req.getRequestDispatcher("/SingIn1.jsp");
    	   dispatcher.forward(req, resp);
       }
	}
}
    	   
		  
		 
		 
		      
	
	


