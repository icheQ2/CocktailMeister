package app.models;

public class Shelf {
    private long id;
    private long userId;
    private String userName;
    private double totalValue;

    public Shelf(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.totalValue = 0;
    }

    public Shelf() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
