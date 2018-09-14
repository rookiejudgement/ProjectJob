package com.teamsankya.bankingsystem.dto;

import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.asm.Advice.OffsetMapping.Factory;

public class MainClass
{
public static void main ( String[]args)
{
	/*SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	AccountHolderBean aib = new AccountHolderBean();
	aib.setAcc_balence(9272);
	
	aib.setAcc_Type("saving");
	aib.setAccountno("50009");
	
	UserInfoBean  uib = new UserInfoBean();
	uib.setAccountHolder(aib);
	uib.setLogin_pass("63875386");
	uib.setLook_status("onthe way");
	uib.setSecreat_question("what is pet name");
	uib.setTran_pass("5235");
	uib.setUidno("1111");
	
	
	CustmerIdBean cib =new CustmerIdBean();
	cib.setAccountholder(aib);
	cib.setAddress("iti road civil lne gonda");
	cib.setCustmer_name("anshuman");
	cib.setEmail("a24pandey@gmail.com");
	cib.setPancard("8967563");
	
	
	FundTransationBean ftb = new FundTransationBean();
	ftb.setDateofTranstion(123);
	ftb.setFundTranstion_id("8908786");
	ftb.setPidNO("53526");
	ftb.setTranstion_amount(60000);
	ftb.setUserbean(uib);
	
	PayeeTableBean ptb = new  PayeeTableBean();
	ptb.setNick_name("vikas");
	ptb.setPidno("888888");
	ptb.setUserinfo(uib);
	 
	TransationBean tib = new TransationBean();
	tib.setDate_of_Trans(7412);
	tib.setTran_amount(666666);
	tib.setTran_desc("acc to acc");
	tib.setTran_idno("980789");
	tib.setTran_Type("saving");
	tib.setUserinfo(uib);
	
	ServiceTrackerBean stb = new  ServiceTrackerBean();
	stb.setServiceId(889696);
	stb.setS_description("tttt");
	stb.setService_raisedDate("0102018");
	stb.setService_status("on the way");
	stb.setHolderBean(aib);
	
	
	
	session.save(aib);
	//session.save(uib);
	//session.save(cib);
	//session.save(ftb);	
	session.save(stb);
	//session.save(tib);
	//session.save(ptb);
	
    
   
	tx.commit();*/
	

	

}
}


