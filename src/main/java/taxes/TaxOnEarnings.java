package main.java.taxes;

public class TaxOnEarnings extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}
