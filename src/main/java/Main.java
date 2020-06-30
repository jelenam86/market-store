package main.java;

import main.java.card.DiscountCard;
import main.java.card.DiscountPolicy;
import main.java.client.Client;
import main.java.pult.PaymentPult;

public class Main {

    public static void main(String[] args) {
	DiscountPolicy bronze = new DiscountPolicy("bronze");
	DiscountPolicy silver = new DiscountPolicy("silver");
	DiscountPolicy gold = new DiscountPolicy("gold");

	Client client1 = new Client("John", "Smith");
	DiscountCard card1 = new DiscountCard(client1, bronze);
	card1.setTurnover(0);
	PaymentPult.printInvoice(card1, 150);

	System.out.println();

	Client client2 = new Client("Oliver", "Jones");
	DiscountCard card2 = new DiscountCard(client2, silver);
	card2.setTurnover(600);
	PaymentPult.printInvoice(card2, 850);

	System.out.println();

	Client client3 = new Client("Jane", "Doe");
	DiscountCard card3 = new DiscountCard(client3, gold);
	card3.setTurnover(1500);
	PaymentPult.printInvoice(card3, 1300);
    }

}
