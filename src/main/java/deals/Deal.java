package main.java.deals;

public class Deal {
    public String comment; // коментарий
    public int creditChange; // сумма расходов
    public int debitChange; // сумма доходов

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }
}
