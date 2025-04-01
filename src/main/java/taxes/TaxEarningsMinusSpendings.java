package main.java.taxes;

public class TaxEarningsMinusSpendings extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        // если расходы оказались больше, то налог посчитается отрицательным
        return Math.max(tax, 0);
    }
}
