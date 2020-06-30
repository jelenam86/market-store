package main.java.card;

import main.java.client.Client;

public class DiscountCard extends Card {

    private DiscountPolicy type;
    private double discountRate;
    private double turnover;

    public DiscountCard(Client owner, DiscountPolicy type) {
	super(owner);
	setType(type);
	setTurnover(0);
    }

    public DiscountPolicy getType() {
	return type;
    }

    public void setType(DiscountPolicy type) {
	if (type == null)
	    throw new NullPointerException("You must choose the type of card.");
	this.type = type;
    }

    public double getTurnover() {
	return turnover;
    }

    public void setTurnover(double turnover) {
	this.turnover = turnover > 0 ? turnover : 0;
	this.discountRate = this.type.calculateDiscountRate(turnover);
    }

    public double getDiscountRate() {
	return discountRate;
    }
}
