import java.util.ArrayList;
import java.util.List;

public class UserShelf {
    private String userName;
    private long userId;
    private List<Component> components;
    private double totalValue;

    public UserShelf(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
        this.components = new ArrayList<>();
        this.totalValue = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Component> getComponents() {
        return components;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void addComponent (Component component) {
        components.add(component);
    }

    public void deleteComponent (Component component) {
        components.remove(component);
    }
}
