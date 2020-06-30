package main.java.card;

import java.util.Arrays;

enum CardType {
    BRONZE, SILVER, GOLD;
}

public class DiscountPolicy {

    private static final double LOWER_THRESHOLD = 100;
    private static final double UPPER_THRESHOLD = 300;
    private static final double BRONZE_DISOUNT_RATE_MINOR = 0;
    private static final double BRONZE_DISCOUNT_RATE_MEDIUM = 1;
    private static final double BRONZE_DISCOUNT_RATE_MAJOR = 2.5;
    private static final double INITIAL_DISCOUNT_RATE = 2;
    private static final double SILVER_UPPER_DISCOUNT_RATE = 3.5;
    private static final double GOLD_DISCOUNT_RATE_GROWTH = 1;
    private static final double GOLD_MAXIMUM_DISCOUNT_RATE = 10;
    private String name;

    public DiscountPolicy(String name) {
	setName(name);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	if (name == null)
	    throw new NullPointerException("You must choose the type of card.");
	if (Arrays.stream(CardType.values()).noneMatch(type -> type.name().equalsIgnoreCase(name)))
	    throw new IllegalArgumentException("Nonexistent type of the card.");
	this.name = name;
    }

    public double calculateDiscountRate(double turnover) {
	if (this.name.equalsIgnoreCase(CardType.BRONZE.name()))
	    return calculateBronzeDiscount(turnover);
	if (this.name.equalsIgnoreCase(CardType.SILVER.name()))
	    return calculateSilverDiscount(turnover);
	return calculateGoldDiscount(turnover);

    }

    private double calculateBronzeDiscount(double turnover) {
	if (turnover > UPPER_THRESHOLD)
	    return BRONZE_DISCOUNT_RATE_MAJOR;
	if (turnover > LOWER_THRESHOLD)
	    return BRONZE_DISCOUNT_RATE_MEDIUM;
	return BRONZE_DISOUNT_RATE_MINOR;
    }

    private double calculateSilverDiscount(double turnover) {
	if (turnover > UPPER_THRESHOLD)
	    return SILVER_UPPER_DISCOUNT_RATE;
	return INITIAL_DISCOUNT_RATE;
    }

    private double calculateGoldDiscount(double turnover) {
	if ((int) Math.round(turnover / LOWER_THRESHOLD) + INITIAL_DISCOUNT_RATE >= GOLD_MAXIMUM_DISCOUNT_RATE)
	    return GOLD_MAXIMUM_DISCOUNT_RATE;
	return INITIAL_DISCOUNT_RATE + GOLD_DISCOUNT_RATE_GROWTH * (int) Math.round(turnover / LOWER_THRESHOLD);
    }
}
