import java.util.ArrayList;

public class FilterTwo {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> lowPrices = new ArrayList<Double>();
    
        filterLowPrices(lowPrices);
    }

    public static void filterLowPrices(ArrayList<Double> lowPrices) {
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                lowPrices.add(prices.get(i));
            }
        }
    }

}
