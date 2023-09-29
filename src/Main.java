public class Main {
    public static void main(String[] args) {

        TaxCalculator sale = new TaxCalculator();
        sale.price = 10.356;
        sale.tax = 2.564;
        sale.quantity = 5;
        System.out.println("I want to buy " + sale.quantity + " shirt!");
        sale.total = sale.price * sale.quantity * sale.tax;
        System.out.println("Total cost with tax is = " + sale.total);
    }
}
