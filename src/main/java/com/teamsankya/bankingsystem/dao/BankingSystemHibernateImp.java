package com.teamsankya.bankingsystem.dao;

import java.io.Console;
import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.sql.ordering.antlr.Factory;

import com.teamsankya.bankingsystem.dto.AccountHolderBean;
import com.teamsankya.bankingsystem.dto.ServiceTrackerBean;
import com.teamsankya.bankingsystem.dto.TransationBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;

public  class BankingSystemHibernateImp implements BankingSystemDAO
 {

	public Boolean CreateAccount(AccountHolderBean holderBean)
	{
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(holderBean);
		tx.commit();
		session.close();
		factory.close();
	
		return true;
	}

	public UserInfoBean Singin(String userid, String password) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		String hql = "from UserInfoBean where uidno=:no and login_pass=:password";
		Query<UserInfoBean> query = session.createQuery(hql);
		query.setParameter("no", userid);
		//System.out.println(password);
		query.setParameter("password", password);
		UserInfoBean user=query.uniqueResult();
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();
		return user;
	}

	@Override
	public Boolean Singup(UserInfoBean userInfoBean)
	{
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory =config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(userInfoBean);
		tx.commit();
		session.close();
		
		
		return true;
	}

	@Override
	public List<TransationBean> ViewMiniStatement(UserInfoBean bean) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean ChangMobileno(String newMobileno,String uidno) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "UPDATE UserInfoBean set Mobileno=:no WHERE uidno=:uno";
		Query<UserInfoBean> query = session.createQuery(hql);
		query.setParameter("no", newMobileno);
		query.setParameter("uno", uidno);
		
		//query.setParameter("id", "uidno");
		int result=query.executeUpdate();
		System.out.println("Rows affected: " + result); 
		
		tx.commit();
		session.close();
		factory.close();
		if(result>0)
		return true;
		else
		return false;
	}

	

	@Override
	public ServiceTrackerBean TrackService(int Service_idno) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public Boolean ChangMobileno(String Password, String newPassword, String conformPassword) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "UPDATE UserInfoBean set Password=:pass WHERE uidno=:uno";
		Query<UserInfoBean> query = session.createQuery(hql);
		query.setParameter("pass", Password);
		query.setParameter("npass", newPassword);
		query.setParameter("cpass", conformPassword);
		
		
		//query.setParameter("id", "uidno");
		int result=query.executeUpdate();
		System.out.println("Rows affected: " + result); 
		
		tx.commit();
		session.close();
		factory.close();
		return true;
		
	}
*/
	@Override
	public Boolean Payee(String pidno, String Accountno, String Nick_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean FundTransfer(int Accountno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransationBean ViewMiniStatmennt(String accon) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		String hql = "from TransationBean where accountno=:no";
		Query<TransationBean> query = session.createQuery(hql);
		query.setParameter("no", accon);
		query.setMaxResults(10);
		TransationBean transInfo= query.getSingleResult();
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();
		//System.out.println(transInfo);
		return transInfo;
	}

	@Override
	public Boolean ChangPassword(String login_pass, String newPassword, String uidno) 
	{
		
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			String hql1 = "from UserInfoBean where uidno=:uno1";
			Query<UserInfoBean> query1 = session.createQuery(hql1);
			query1.setParameter("uno1", uidno);
			UserInfoBean user=query1.uniqueResult();
			int result=0;
			//System.out.println(uidno+"::::"+user.getLogin_pass()+"::"+login_pass);
			
			//Validating Password
			if(user.getLogin_pass().equals(login_pass)) {
				String hql = "UPDATE UserInfoBean set login_pass=:npass WHERE uidno=:uno and login_pass=:pass ";
				Query<UserInfoBean> query = session.createQuery(hql);
				query.setParameter("pass", login_pass);
				query.setParameter("npass", newPassword);
				query.setParameter("uno", uidno);
				result=query.executeUpdate();

				System.out.println("Rows affected: " + result+"\n Password Changed...!"); 
			}
			else {
				System.out.println("Password not changed...!");
				result=0;
			}
			tx.commit();
			session.close();
			factory.close();
			if(result>0)return true;
			else return false;
	}

	@Override
	public int requestCheckBook(ServiceTrackerBean serviceTrackerBean) 
	{
		Configuration n = new Configuration();
		n.configure();
		SessionFactory factory =n.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		java.util.Date d = new java.util.Date();
		String s = d.getDate() + "/" +d.getMonth() + "/" +d.getYear();
		serviceTrackerBean.setService_raisedDate(s);
		
		serviceTrackerBean.setService_status("open");
		
		int p=(int) session.save(serviceTrackerBean);
		//int id=serviceTrackerBean.getServiceId();
		//System.out.println("::id::"+id+"::p::"+p);
		tx.commit();
		session.close();
		factory.close();
		return  p;
	}

}

	

	

	

	

  

