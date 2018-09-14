package com.teamsankya.bankingsystem.dao;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.hibernate.Transaction;

import com.teamsankya.bankingsystem.dto.AccountHolderBean;
import com.teamsankya.bankingsystem.dto.FundTransationBean;
import com.teamsankya.bankingsystem.dto.ServiceTrackerBean;
import com.teamsankya.bankingsystem.dto.TransationBean;
import com.teamsankya.bankingsystem.dto.UserInfoBean;

public interface BankingSystemDAO   
{
	Boolean CreateAccount(AccountHolderBean holderBean);
	UserInfoBean    Singin(String userid,String Password);
	Boolean Singup(UserInfoBean userInfoBean);
	List<TransationBean> ViewMiniStatement(UserInfoBean bean);
	//Boolean ChangAddress(UserInfoBean bean);
	Boolean ChangMobileno(String newMobileno,String uidno);
	int requestCheckBook(ServiceTrackerBean serviceTrackerBean);
	ServiceTrackerBean TrackService(int Service_idno);
    Boolean ChangPassword(String login_pass,String newPassword,String uidno);
	Boolean Payee(String pidno,String Accountno,String Nick_name);
	Boolean FundTransfer(int Accountno);
	TransationBean ViewMiniStatmennt(String acno);
}