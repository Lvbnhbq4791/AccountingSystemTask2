package main.java.deals;

// Класс "Расход"
public class Expenditure extends Deal {
    public Expenditure(String comment, int creditChange, int debitChange) {
        super(comment, creditChange, debitChange);
    }

    public Expenditure() {
        super("", 0, 0);
    }

    public Expenditure createExpenditure(String productName, int price) {
        String comment = "Покупка " + productName + " на " + price + " руб.";
        return new Expenditure(comment, price, 0);
    }
}
