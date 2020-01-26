package com.atm.model;

public class AtmCard {
	private static String BankName ="SBI";
	private String cardNo;
	private int pin;
	private String UserName;
	public AtmCard() {
		
	}
	public AtmCard(String cardNo, int pin, String userName) {
		this.cardNo = cardNo;
		this.pin = pin;
		UserName = userName;
	}

	final public static String getBankName() {
		return BankName;
	}
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
	
}
