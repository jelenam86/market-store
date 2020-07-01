package main.java.card;

import main.java.client.Client;

public class SilverCard extends DiscountCard {

    private static final double INITIAL_DISCOUNT_RATE = 2;
    private static final double UPPER_DISCOUNT_RATE = 3.5;
    private static final double THRESHOLD = 300;

    public SilverCard(Client owner) {
	super(owner, DiscountCardType.SILVER);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
	if (turnover > THRESHOLD)
	    return UPPER_DISCOUNT_RATE;
	return INITIAL_DISCOUNT_RATE;
    }

    public static double getInitialDiscountRate() {
	return INITIAL_DISCOUNT_RATE;
    }

    public static double getUpperDiscountRate() {
	return UPPER_DISCOUNT_RATE;
    }

    public static double getThreshold() {
	return THRESHOLD;
    }

}
