package com.bridgelabz.gamblergame;

public class GamblerGame {
	static int STAKE_AMOUNT=100;
	static int BET_AMOUNT=1;
	static int WON=1;
	static int LOST=0;
	static int TOTAL_AMOUNT=0;
	public static void main(String[] args) {
		int play = (int) Math.floor(Math.random() * 10) % 2;
		 System.out.println("Gamblers play:"+play);
		 for (int i = 1; i <= 20; i++) {
			 int cashInHand = STAKE_AMOUNT;
			 while(cashInHand > 50 && cashInHand < 150) {
				 int start = (int) Math.floor(Math.random() * 10) % 2;
				 System.out.println("Gamblers play:"+play);
		 
				 switch(play) {
				 	case 1:
				 		 cashInHand = cashInHand + BET_AMOUNT;
				 		 System.out.println("Total current cash gambler has "+cashInHand);
				 		 break;
				 	case 2:
				 		 cashInHand = cashInHand - BET_AMOUNT;
				 		 System.out.println("Total current cash gambler has "+cashInHand);
				 		 break;
				 	default:
				 		 System.out.println("default");
				 }
				 if(play == 1) {
					 System.out.println("Player won the first play");
				 }
				 else {
					 System.out.println("Player lost the first play");
				 }
		 }
		 if(cashInHand==150 || cashInHand==50) {
			 System.out.println("Player would like to resign for current day");
			 
		 }
		 TOTAL_AMOUNT = TOTAL_AMOUNT + cashInHand;
		 }
		System.out.println("Total amount player has after 20 days as per day included = "+TOTAL_AMOUNT+" $");	 
	}
}
