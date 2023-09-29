import java.awt.color.ICC_ColorSpace;

public class Main {
    public static void main(String[] args) {

        TaxCalculator shop = new TaxCalculator();
        shop.price = 10.356;
        shop.tax = 2.564;
        shop.quantity = 5;
        System.out.println("I want to buy " + shop.quantity + " shirts!");
        shop.total = shop.total = shop.price * shop.quantity * shop.tax;
        System.out.println("Price = " + shop.price + " $");
        System.out.println("Tax = " + shop.tax + " $");
        System.out.println("Total cost with tax is = " + shop.total + " $");
    }
}
