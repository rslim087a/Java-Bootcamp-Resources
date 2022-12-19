import java.util.ArrayList;

public class Map {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> withTax = new ArrayList<Double>();
        tax(withTax);

    }

    public static void tax(ArrayList<Double> withTax) {
        for (int i = 0; i < prices.size(); i++) {
                withTax.add(prices.get(i) * 1.13);
        }
    }

}
