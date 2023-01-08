import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Item> map = new HashMap<>();
        map.put("WIDG-001", new Item("Widget", 3.99));
        map.put("GADG-002", new Item("Gadget", 5.99));
        map.put("THNG-003", new Item("Thingamajig", 2.99));
        map.put("DBOO-004", new Item("Doo-dad", 4.99));
        map.put("WIDG-005", new Item("Super Widget", 6.99));
        map.put("GADG-006", new Item("Super Gadget", 8.99));
        map.put("THNG-007", new Item("Super Thingamajig", 15));
        map.put("DOFO-008", new Item("Super Doo-dad", 10));

        System.out.println("\nSKU \t\tPrice\tItem");
        map.forEach((sku, item) -> System.out.println(sku + "\t" + item.getPrice() + "\t" + item.getName()));

    }
}