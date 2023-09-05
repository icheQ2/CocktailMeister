package app.dao;

import app.models.Shelf;

import java.util.ArrayList;
import java.util.List;

public class ShelfDAO {
    private List<Shelf> shelfs;

    {
        shelfs = new ArrayList<>();
    }

    public List<Shelf> index() {
        return shelfs;
    }

    public Shelf show(long userId) {
        return shelfs.stream().filter(shelf -> shelf.getUserId() == userId).findAny().orElse(null);
    }

    public void save(Shelf shelf) {
        shelfs.add(shelf);
    }

    public void update(long userId, Shelf shelf) {
        Shelf shelfToBeUpdated = show(userId);

        shelfToBeUpdated.setUserName(shelf.getUserName());
        shelfToBeUpdated.setTotalValue(shelf.getTotalValue());
    }

    public void delete (long userId) {
        shelfs.removeIf(shelf -> shelf.getUserId() == userId);
    }
}
