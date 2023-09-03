package app.dao;

import app.models.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptDAO {
    private List<Receipt> receipts;

    {
        receipts = new ArrayList<>();
    }

    public List<Receipt> index() {
        return receipts;
    }

    public List<Receipt> showAll() {
        return receipts;
    }

    public Receipt show(long id) {
        return receipts.stream().filter(receipt -> receipt.getId() == id).findAny().orElse(null);
    }

    public void save(Receipt receipt) {
        receipts.add(receipt);
    }

    public void update(long id, Receipt receipt) {
        Receipt componentToBeUpdated = show(id);

        componentToBeUpdated.setName(receipt.getName());
        componentToBeUpdated.setIngredientsList(receipt.getIngredientsList());
        componentToBeUpdated.setVolumesList(receipt.getVolumesList());
        componentToBeUpdated.setPrice(receipt.getPrice());
        componentToBeUpdated.setVolume(receipt.getVolume());
        componentToBeUpdated.setPreparationMethods(receipt.getPreparationMethods());
    }

    public void delete (long id) {
        receipts.removeIf(receipt -> receipt.getId() == id);
    }
}
