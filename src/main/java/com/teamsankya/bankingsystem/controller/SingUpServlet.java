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

@WebServlet("/SingUp")
public class SingUpServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session= req.getSession(false);
		
		RequestDispatcher dispatcher = null;
		String Acc_idno= req.getParameter("Acc_idno");
		String User_idno = req.getParameter("User_idno");
		String Login_password = req.getParameter("Login_password");
		String Secret_question = req.getParameter("Secret_question");
		String  Trans_password= req.getParameter("Trans_password");
		String Look_status = req.getParameter("Look_status");
		String email = req.getParameter("email");
		String pancard_no = req.getParameter("pancard_no");
		
		UserInfoBean bean = new UserInfoBean();
		
	    bean.setAccountno(Acc_idno);
	    bean.setUidno(User_idno);
	    bean.setSecreat_question(Secret_question);
	    bean.setLogin_pass(Login_password);
	    bean.setTran_pass(Trans_password);
	    bean.setLook_status(Look_status);
	    bean.setEmail(email);
	    bean.setPancard_no(pancard_no);
	    
	    BankingSystemHibernateImp imp = new BankingSystemHibernateImp();
	     Boolean b= imp.Singup(bean);
	     
	     if(b!=null)
	     {
	    	 dispatcher= req.getRequestDispatcher("/SingUp.jsp");
	    	 dispatcher.forward(req, resp);
	    			 
	     }
	     else
	     {
	    	 dispatcher= req.getRequestDispatcher("/SingUp1.jsp");
	    	 dispatcher.forward(req, resp);
	     }
		
		
		
		
		
	}

}
