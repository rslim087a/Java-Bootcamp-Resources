package src.main.model;

public class Trade {

    public enum Stock { AAPL, FB, GOOG, TSLA }
    public enum Type { MARKET_BUY, MARKET_SELL }
    
    private Stock stock;
    private Type type;
    private double price;
    private int shares;

    public Trade(Stock stock, Type type, double price, int shares) {
        if (price < 0 || shares <= 0) {
            throw new IllegalArgumentException("INVALID PARAMS");
        }
        this.stock = stock;
        this.type = type;
        this.price = price;
        this.shares = shares;
    }

    public Trade(Trade source) {
        this.stock = source.stock;
        this.type = source.type;
        this.price = source.price;
        this.shares = source.shares;
    }


    public Stock getStock() {
        return this.stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("INVALID PRICE");
        }
        this.price = price;
    }

    public int getShares() {
        return this.shares;
    }

    public void setShares(int shares) {
        if (shares <= 0) {
            throw new IllegalArgumentException("INVALID SHARES VALUE");
        }
        this.shares = shares;
    }

}
