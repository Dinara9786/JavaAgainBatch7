package com.review.class31;

import java.util.Iterator;
import java.util.LinkedList;

public class CreditCardTest {

	public static void main(String[] args) {

		LinkedList<CreditCard> cards = new LinkedList<>(); // we use LInkedList to have access to all the elements

		System.out.println("=========FOR EACH LOOP==========");
		cards.add(new BOA("express"));
		cards.add(new Citi("cash", 16.99));
		cards.add(new Chase("Freedom", "reliable"));

		for (CreditCard card : cards) {
			card.deposit();
			card.withdraw();

		}

		System.out.println("=========FOR REGULAR LOOP==========");
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).deposit();
			cards.get(i).withdraw();

		}

		System.out.println("=========FOR ITERATOR==========");
		Iterator<CreditCard> cardss = cards.iterator();
		while (cardss.hasNext()) {
			CreditCard cr = cardss.next();
			cr.deposit();
			cr.withdraw();
			

		}
		
		System.out.println("=========Creating Objects ==========");

		Citi citi = new Citi("Citi", 20.99);
		citi.chargeInterest();
	}

}
