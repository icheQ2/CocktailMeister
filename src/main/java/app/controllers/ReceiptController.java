package app.controllers;

import app.dao.ReceiptDAO;
import app.models.Receipt;

import java.util.List;

public class ReceiptController {

    private static final ReceiptDAO receiptDAO = new ReceiptDAO();

    public static List<Receipt> index() {
        return receiptDAO.index();
    }

    public static List<Receipt> showAll() {
        return receiptDAO.showAll();
    }

    public static Receipt show(long id) {
        return receiptDAO.show(id);
    }

    public static void create(Receipt receipt) {
        receiptDAO.save(receipt);
    }

    public static void update(long id, Receipt receipt) {
        receiptDAO.update(id, receipt);
    }

    public static void delete(long id) {
        receiptDAO.delete(id);
    }
}
