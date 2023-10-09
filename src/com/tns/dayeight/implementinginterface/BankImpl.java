package com.tns.dayeight.implementinginterface;

public class BankImpl implements Bank{
	
	@Override
	public void deposit (Account account,double amount) {
		
		if(amount  > DEPOSIT_LIMIT)
			System.err.println("Deposit not possible");
		else
			System.out.println("Deposited " +amount +"into amount "+ account.getAccNo());
	}
	
	@Override
	public void withdraw(Account account,double amount)
	{
		if(account.getBalance() - amount >= MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("withdran "+ amount + "from account :"+ account.getAccNo());
		}else
			
			System.out.println("Insuffient balance in account "+ account.getAccNo());
	}
		

}
