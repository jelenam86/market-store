package main.java.discount;

public interface DiscountPolicy {

    public void setTurnover(double turnover);
    public void setDiscountType(DiscountCardType type);
    public double calculateDiscountRate(double turnover);
}
