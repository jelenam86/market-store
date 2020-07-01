package main.java;

import main.java.card.BronzeCard;
import main.java.card.GoldenCard;
import main.java.card.SilverCard;
import main.java.client.Client;
import main.java.pult.PaymentPult;

public class Main {

    public static void main(String[] args) {

	Client client1 = new Client("John", "Smith");
	BronzeCard card1 = new BronzeCard(client1);
	card1.setTurnover(0);
	PaymentPult.printInvoice(card1, 150);

	System.out.println();

	Client client2 = new Client("Oliver", "Jones");
	SilverCard card2 = new SilverCard(client2);
	card2.setTurnover(600);
	PaymentPult.printInvoice(card2, 850);

	System.out.println();

	Client client3 = new Client("Jane", "Doe");
	GoldenCard card3 = new GoldenCard(client3);
	card3.setTurnover(1500);
	PaymentPult.printInvoice(card3, 1300);
    }

}
