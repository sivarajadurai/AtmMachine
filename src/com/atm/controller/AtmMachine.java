package com.atm.controller;

import java.util.Scanner;

import com.atm.model.AtmCard;
import com.atm.model.EcomCard;
import com.atm.model.Server;

public class AtmMachine {

	public static void main(String[] args) {
//		//the below object is created with parameterized constructor
//		AtmCard c1= new AtmCard("4111111111111111",1234,"Siva");
//		EcomCard e1 = new EcomCard("4111111111111223",1234,"Arun","26-1-2020",345);
//		
//
//		//the below object is created with non-parameterized constructor
//		AtmCard c2 = new AtmCard();
//		c2.setCardNo("411111111111122");
//		c2.setPin(2222);
//		c2.setUserName("Ramesh");
//		
//		
//		System.out.println("================PRINT OUT==================");
//		System.out.println("ATM Bank Name :"+AtmCard.getBankName());
//		System.out.println("ECOM Bank Name :"+EcomCard.getBankName());
//		System.out.println("ATM Card Number : "+c1.getCardNo());
//		System.out.println("Ecom Card Number : "+e1.getCardNo());
		
		
		Scanner s = new Scanner(System.in);
		Server s1 = new Server();
		System.out.println("Enter your cardnumber : ");
		String cardNo =  s.next();
		System.out.println("Enter your PIN : ");
		int pin =s.nextInt();
		String name = s1.getName(cardNo, pin);
		System.out.println("Welcome "+name);
		
	}

}
