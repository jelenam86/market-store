package main.java.card;

import main.java.client.Client;
import main.java.discount.DiscountCardType;

public class BronzeCard extends DiscountCard {

    private static final double LOWER_THRESHOLD = 100;
    private static final double UPPER_THRESHOLD = 300;
    private static final double DISOUNT_RATE_MINOR = 0;
    private static final double DISCOUNT_RATE_MEDIUM = 1;
    private static final double DISCOUNT_RATE_MAJOR = 2.5;

    public BronzeCard(Client owner) {
	super(owner, DiscountCardType.BRONZE);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
	if (turnover > UPPER_THRESHOLD)
	    return DISCOUNT_RATE_MAJOR;
	if (turnover > LOWER_THRESHOLD)
	    return DISCOUNT_RATE_MEDIUM;
	return DISOUNT_RATE_MINOR;
    }

    public static double getLowerThreshold() {
	return LOWER_THRESHOLD;
    }

    public static double getUpperThreshold() {
	return UPPER_THRESHOLD;
    }

    public static double getDisountRateMinor() {
	return DISOUNT_RATE_MINOR;
    }

    public static double getDiscountRateMedium() {
	return DISCOUNT_RATE_MEDIUM;
    }

    public static double getDiscountRateMajor() {
	return DISCOUNT_RATE_MAJOR;
    }

}
