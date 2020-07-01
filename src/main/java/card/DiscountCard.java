package main.java.card;

import main.java.client.Client;

public abstract class DiscountCard extends Card {

    private DiscountCardType type;
    private double discountRate;
    private double turnover;

    public DiscountCard(Client owner, DiscountCardType type) {
	super(owner);
	setType(type);
	setTurnover(0);
    }

    public DiscountCardType getType() {
	return type;
    }

    private void setType(DiscountCardType type) {
	if (type == null)
	    throw new NullPointerException("You must choose the type of card.");
	this.type = type;
    }

    public double getTurnover() {
	return turnover;
    }

    public void setTurnover(double turnover) {
	this.turnover = turnover > 0 ? turnover : 0;
	this.discountRate = calculateDiscountRate(turnover);
    }

    public double getDiscountRate() {
	return discountRate;
    }

    public abstract double calculateDiscountRate(double turnover);
}
