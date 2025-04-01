import main.java.Company;
import main.java.deals.*;
import main.java.taxes.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ТУТА", new TaxSystem());
        int difference;
        Deal[] deals;

        // Проверка:  УСН доходы — налог 6% от доходов
        company.setDebit(10000);
        deals = new Deal[]
                {new Expenditure().createExpenditure("Диван", 1000),
                        new Sale().createSale("Диван", 2000),
                        new Expenditure().createExpenditure("Стол", 500),
                        new Sale().createSale("Стол", 1000)};
        company.shiftMoney(-100);
        difference = company.applyDeals(deals);
        company.setTaxSystem(new TaxOnEarnings());
        company.payTaxes();
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: " + difference + " руб.");
        System.out.println();

        // Проверка:  УСН доходы минус расходы — налог 15% от разницы доходов и расходов
        company.setDebit(10000);
        deals = new Deal[]
                {new Expenditure().createExpenditure("Диван", 1000),
                        new Sale().createSale("Диван", 2000),
                        new Expenditure().createExpenditure("Стол", 500),
                        new Sale().createSale("Стол", 1000)};
        company.shiftMoney(100);
        difference = company.applyDeals(deals);
        company.setTaxSystem(new TaxEarningsMinusSpendings());
        company.payTaxes();
        System.out.println("Разница доходов и расходов, которая была на момент старта уплаты налогов: " + difference + " руб.");


    }
}