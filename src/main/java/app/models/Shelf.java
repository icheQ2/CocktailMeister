package app.models;

public class Shelf {
    private String userName;
    private final long userId;
    private double totalValue;

    public Shelf(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.totalValue = 0;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
