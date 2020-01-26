package com.atm.model;

public class Server {

	AtmCard cards [] = new AtmCard[5];
	public Server() {
		cards[0]=new AtmCard("4111111111111111",1234,"Siva");
		cards[1]=new AtmCard("4111111111111112",1111,"Vasanth");
		cards[2]=new AtmCard("4111111111111113",2222,"Dinesh");
		cards[3]=new AtmCard("4111111111111114",3333,"Nokesh");
		cards[4]=new AtmCard("4111111111111115",4444,"Geetha");
	}
	
	
	public String getName(String cardNo,int pin){
		String name = "";
		for(AtmCard card:cards) {
			String server_card = card.getCardNo();
			int server_pin = card.getPin();
			if(server_card.equals(cardNo) && server_pin == pin) {
				name=card.getUserName();
			}
		}
		return name;
	}
	
}
