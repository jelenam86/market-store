package main.java.card;

import main.java.client.Client;
import main.java.discount.DiscountCardType;

public class GoldenCard extends DiscountCard {

    private static final double THRESHOLD = 100;
    private static final double INITIAL_DISCOUNT_RATE = 2;
    private static final double DISCOUNT_RATE_GROWTH = 1;
    private static final double MAXIMUM_DISCOUNT_RATE = 10;

    public GoldenCard(Client owner) {
	super(owner, DiscountCardType.GOLD);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
	if ((int) Math.round(turnover / THRESHOLD) + INITIAL_DISCOUNT_RATE >= MAXIMUM_DISCOUNT_RATE)
	    return MAXIMUM_DISCOUNT_RATE;
	return INITIAL_DISCOUNT_RATE + DISCOUNT_RATE_GROWTH * (int) Math.round(turnover / THRESHOLD);
    }

    public static double getThreshold() {
	return THRESHOLD;
    }

    public static double getInitialDiscountRate() {
	return INITIAL_DISCOUNT_RATE;
    }

    public static double getDiscountRateGrowth() {
	return DISCOUNT_RATE_GROWTH;
    }

    public static double getMaximumDiscountRate() {
	return MAXIMUM_DISCOUNT_RATE;
    }

}
