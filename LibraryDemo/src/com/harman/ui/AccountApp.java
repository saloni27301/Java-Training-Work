package com.harman.ui;

import com.harman.Exception.InSuffuicientBalanceException;
import com.harman.model.Account;

public class AccountApp {

	public static void main(String[] args) {
		
		Account first=new Account(101,"vidya",500);
		System.out.println(first);
		first.deposit(600);
		System.out.println(first);
		first.withdraw(400);
		System.out.println(first);
		try {
			first.withdraw2(4000);
		} catch (InSuffuicientBalanceException excep) {
			System.out.println(excep.getMessage());
		}finally {
			System.out.println(first);
		}
	}

}
