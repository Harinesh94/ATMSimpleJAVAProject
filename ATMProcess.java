package com.atm;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMProcess {

	private String name;
	private BigDecimal custId;
	private String bankName;
	private int balanceAmount;
	private String accountType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCustId() {
		return custId;
	}
	public void setCustId(BigDecimal custId) {
		this.custId = custId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		bankName = bankName;
	}
	public ATMProcess(String name, BigDecimal custId, String bankName) {
		this.name = name;
		this.custId = custId;
		this.bankName = bankName;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void process(){
		System.out.println("Welcome to" + bankName);
		System.out.println("Welcome" + name);
		System.out.println("Please select the Account Type");
		
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		
		Scanner accountType = new Scanner(System.in);
		int type = accountType.nextInt();
		
		if(type == 1){
			System.out.println("You had selected"+ type + "Saving Account");
		}else{
			System.out.println("You had selected"+ type + "Current Account");
		}
		
		System.out.println("Please select the Process");
		
		System.out.println("1.Withdraw");
		System.out.println("2.Check Balance");
		System.out.println("3.MiniStatement");
		System.out.println("4.ProfileDetails");
		
		Scanner process = new Scanner(System.in);
		int aProcess = process.nextInt();
	
		String sdf;
		
		int totalBalace = 10000;
		
		if(aProcess == 1){
			System.out.println("You had selected"+ aProcess + "Withdraw");
		}else if(aProcess == 2){
			System.out.println("You had selected"+ aProcess + "Check Balance");
		}else if(aProcess == 3){
			System.out.println("You had selected"+ aProcess + "MiniStatement");
		}else if(aProcess == 4){
			System.out.println("You had selected"+ aProcess + "ProfileDetails");
		}else{
			System.out.println("Invalid Number/Option");
		}
		
		switch(aProcess){
		case 1:
			System.out.println("Enter the Amount to Withdraw");
			Scanner withdrawAmount = new Scanner(System.in);
			int amountwithdrawn = withdrawAmount.nextInt();
			System.out.println(amountwithdrawn + "is withdrwan from your account successfully");
			int balance = chackBalance(amountwithdrawn,totalBalace);
			System.out.println("Balance Of ur Account is"+ balance);
			
			System.out.println("Do you want to continue for further Action,pls type as YES/NO");
			Scanner contFurther3 = new Scanner(System.in);
			sdf = contFurther3.next();
			if(sdf.equalsIgnoreCase("YES"))
				process();
			else
			  System.out.println("Thankyou for using ATM Process");
			
			break;
		case 2:
			System.out.println("Balance Of ur Account is"+ totalBalace);
			System.out.println("Do you want to continue for further Action,pls type as YES/NO");
			Scanner contFurther1 = new Scanner(System.in);
			sdf = contFurther1.next();
			if(sdf.equalsIgnoreCase("YES"))
				process();
			else
			  System.out.println("Thankyou for using ATM Process");
			
			break;
		case 3:
			System.out.println("Soory for the inConvenience.Ministatement is unable to process");
			System.out.println("Do you want to continue for further Action,pls type as YES/NO");
			Scanner contFurther2 = new Scanner(System.in);
			sdf = contFurther2.next();
			if(sdf.equalsIgnoreCase("YES"))
				process();
			else
			  System.out.println("Thankyou for using ATM Process");
			
			break;
		case 4:	
			System.out.println("Profile Details:");
			System.out.println("Name:"+name);
			System.out.println("CustId:"+custId);
			System.out.println("Bank:"+bankName);
			System.out.println("AccountType:"+type);
			System.out.println("Do you want to continue for further Action,pls type as YES/NO");
			Scanner contFurther5 = new Scanner(System.in);
			 sdf = contFurther5.next();
			if(sdf.equalsIgnoreCase("YES"))
				process();
			else
			  System.out.println("Thankyou for using ATM Process");
			
			break;
		default:
			System.out.println("Invalid Number/Option");
		}

	}
	private int chackBalance(int amountwithdrawn, int totalBalace) {
		balanceAmount = totalBalace - amountwithdrawn;
		return balanceAmount;
	}
	
}
