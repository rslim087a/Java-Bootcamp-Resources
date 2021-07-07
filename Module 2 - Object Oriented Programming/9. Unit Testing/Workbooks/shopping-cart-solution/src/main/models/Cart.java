package src.main.models;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;
    private static final double TAX_RATE = 0.13;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        }
        this.items.add(new Item(item));
        return true;
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    public void clear() {
        this.items.clear();
    }

    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("INVALID STATE");
        }
        this.items.removeIf((item) -> item.getName().equals(name));
    }

    public double getSubtotal() {
        return this.items.stream().mapToDouble((item) -> item.getPrice()).sum();
    }

    public double getTax(double subtotal) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(subtotal * TAX_RATE));
    }

    public double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("INVALID STATE");
        }
        return "\tRECEIPT\n\n" +
        "\tSubtotal: $" + getSubtotal() + "\n" +
        "\tTax: $" + getTax(getSubtotal()) + "\n" +
        "\tTotal: $" + getTotal(getSubtotal(), getTax(getSubtotal())) + "\n";
    }

    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}
