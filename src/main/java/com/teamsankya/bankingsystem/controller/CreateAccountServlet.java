package com.teamsankya.bankingsystem.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.hql.internal.HolderInstantiator;
import org.omg.PortableInterceptor.HOLDING;

import com.teamsankya.bankingsystem.dao.BankingSystemDAO;
import com.teamsankya.bankingsystem.dao.BankingSystemHibernateImp;
import com.teamsankya.bankingsystem.dto.AccountHolderBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;
@WebServlet("/CreateAccount")
public class CreateAccountServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		RequestDispatcher dispatcher =null;
		String accountno=req.getParameter("accountno");
		String Acc_type = req.getParameter("Acc_type");
		String Address= req.getParameter("Address");
		String Acc_opendate = req.getParameter("Acc_opendate");
        UserInfoBean user=(UserInfoBean)session.getAttribute("sss");
		
		AccountHolderBean holderBean = new AccountHolderBean();
	    holderBean.setUser(user);
		holderBean.setAcc_Type(Acc_type);
	    holderBean.setAddress(Address);
		//holderBean.setAcc_openDate(new SimpleDateFormat("mm/dd/yyyy").parse(Acc_opendate).getTime());
		
	    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
	    java.util.Date date=null;
		try {
			date = sdf1.parse(Acc_opendate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()); 
	    holderBean.setAcc_openDate(sqlStartDate);
	    
	    
		BankingSystemHibernateImp hibernateImp = new BankingSystemHibernateImp();
		boolean b=hibernateImp.CreateAccount(holderBean);
		
		if(b)
		{
		  dispatcher = req.getRequestDispatcher("/CreateAccount.jsp") ;
		  dispatcher.forward(req, resp);
		
		}
		else {
			dispatcher= req.getRequestDispatcher("/CreateAccount1.jsp");
			dispatcher.forward(req, resp);
			
		}
		
	}
	
		

	}
	
	


