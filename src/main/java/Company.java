package main.java;

import main.java.deals.Deal;
import main.java.taxes.TaxSystem;

public class Company {
    public String title; // название компании
    private int debit; // доходы компании
    private int credit; // расходы компании
    public TaxSystem taxSystem; // система уплаты налогов

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public String getTitle() {
        return title;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) debit += amount;
        else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            this.debit += deal.debitChange;
            this.credit += deal.creditChange;
            System.out.println(deal.comment);
        }
        return debit - credit;
    }
}
