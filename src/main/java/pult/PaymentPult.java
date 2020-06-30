package main.java.pult;

import main.java.card.Card;
import main.java.card.DiscountCard;

public class PaymentPult {
    public static double getDiscountRate(Card card) {
	if (card instanceof DiscountCard && card != null)
	    return ((DiscountCard) card).getDiscountRate();
	return 0;
    }

    public static double getDiscount(Card card, double valueOfPurchase) {
	return valueOfPurchase * getDiscountRate(card) / 100;
    }

    public static double getTotal(Card card, double valueOfPurchase) {
	return valueOfPurchase - getDiscount(card, valueOfPurchase);
    }

    public static void printInvoice(Card card, double valueOfPurchase) {
	String invoice = String.format("Purchase value: $%.2f\nDiscount rate: %.1f%s\nDiscount: $%.2f\nTotal: $%.2f",
		valueOfPurchase, getDiscountRate(card), "%", getDiscount(card, valueOfPurchase),
		getTotal(card, valueOfPurchase));
	System.out.println(invoice);
    }
}
