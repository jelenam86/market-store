package main.java.card;

import main.java.client.Client;
import main.java.discount.DiscountCardType;
import main.java.discount.DiscountPolicy;

public abstract class DiscountCard extends Card implements DiscountPolicy {

    private DiscountCardType type;
    private double discountRate;
    private double turnover;

    public DiscountCard(Client owner, DiscountCardType type) {
	super(owner);
	setDiscountType(type);
	setTurnover(0);
    }

    public DiscountCardType getType() {
	return type;
    }

    @Override
    public void setDiscountType(DiscountCardType type) {
	if (type == null)
	    throw new NullPointerException("You must choose the type of card.");
	this.type = type;
    }

    public double getTurnover() {
	return turnover;
    }

    @Override
    public void setTurnover(double turnover) {
	this.turnover = turnover > 0 ? turnover : 0;
	this.discountRate = calculateDiscountRate(turnover);
    }

    public double getDiscountRate() {
	return discountRate;
    }
}
