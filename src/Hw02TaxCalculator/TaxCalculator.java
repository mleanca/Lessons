package Hw02TaxCalculator;

public class TaxCalculator { //EXERCISE 3
    private double price;
    private double tax;
    private int quantity;
    public static String message1 = "I want to buy ";
    public static String message2 = " shirt(s)!";
    public static String totalCost = "Total cost with tax is = ";

    public static String wantShirt(int quantity) {
        return (message1 + quantity + message2);
    }

    public static String getTotalTax(double price, int quantity, double tax) {
        return ("Total tax is = " + (price * quantity * tax));
    }

    public static String getTotalCost(double price, int quantity, double tax) {
        return (totalCost.concat(String.valueOf((price * quantity) + (price * quantity * tax))));
    }
}

