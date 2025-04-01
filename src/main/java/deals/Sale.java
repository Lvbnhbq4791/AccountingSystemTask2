package main.java.deals;

public class Sale extends Deal {
    public Sale(String comment, int creditChange, int debitChange) {
        super(comment, creditChange, debitChange);
    }

    public Sale() {
        super("", 0, 0);
    }

    public Sale createSale(String productName, int price) {
        String comment = "Продажа " + productName + " на " + price + " руб.";
        return new Sale(comment, 0, price);
    }

}
