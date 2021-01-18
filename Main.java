package com.atm;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String [] args){
		BigDecimal id = new BigDecimal(09876.54321);
		ATMProcess atm = new ATMProcess("Harinesh",id,"SBI");
		atm.process();
	}

}
