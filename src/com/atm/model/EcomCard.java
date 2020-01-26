package com.atm.model;

public class EcomCard extends AtmCard {

	public EcomCard(String cardNo, int pin, String userName,String doe,int cvv) {
		super(cardNo, pin, userName);
		this.doe = doe;
		this.cvv = cvv;
	}
	private String doe;
	private int cvv;
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	public String getCardNo() {
		String cNo=super.getCardNo();
		return cNo.substring(12);
	}
	
}
