package src.main.model.account;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import src.main.model.Trade;
import src.main.model.Trade.Stock;
import src.main.utils.Color;

public abstract class Account {

    private Map<Stock, Integer> portfolio;
    private double funds;

    public Account(double funds) {        
        this.funds = funds;
        this.portfolio = new HashMap<Stock, Integer>();
        this.portfolio.put(Stock.AAPL, 0);
        this.portfolio.put(Stock.FB, 0);
        this.portfolio.put(Stock.GOOG, 0);
        this.portfolio.put(Stock.TSLA, 0);
    }

    public Account(Account source) {
        this.portfolio = copyMap(source.portfolio);
        this.funds = source.funds;
    }

    private Map<Stock, Integer> copyMap(Map<Stock, Integer> map) {
        return map.entrySet().stream()
            .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    public double getFunds() {
        return this.funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Integer getShares(Stock stock) {
        return this.portfolio.get(stock) ;
    }

    public void setShares(Stock stock, Integer shares) {
        this.portfolio.put(stock, shares);
    }


    public abstract Account clone();



    public abstract boolean makeTrade(Trade trade);

    protected boolean executePurchase(Trade trade, double fee) {
        double total = trade.getShares() * trade.getPrice();
        if (total <= this.getFunds()) {
            this.setFunds(this.getFunds() - total - total * fee);
            addShares(trade);
            return true;
        }
        return false;
    }

    protected boolean executeSale(Trade trade, double fee) {
        if (trade.getShares() <= this.getShares(trade.getStock())) {
            this.setShares(trade.getStock(), getCurrentShares(trade.getStock()) - trade.getShares());
            addFunds(trade, fee);
            return true;
        }
        return false;
    }


    private void addShares(Trade trade) {
        int currentShares = getCurrentShares(trade.getStock());
        this.setShares(trade.getStock(), currentShares + trade.getShares());
    }

    private void addFunds(Trade trade, double fee) {
        double total = trade.getShares() * trade.getPrice();
        this.setFunds(this.getFunds() + total - total * fee);
    }

    private int getCurrentShares(Stock stock) {
        return portfolio.get(stock) == null ? 0 : portfolio.get(stock);
    }

    private String displayPortofolio() {
        String string = "";
        for (Map.Entry<Stock, Integer> entry : portfolio.entrySet()) {
            string += "  " + Color.BLUE + entry.getKey() + "\t\t";
            string += Color.GREEN + entry.getValue();
            string += "\n";
        }        
        return string;
    }

    private double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }

    @Override
    public String toString() {
        return "\n  Stock\t\t"  + Color.RESET + "Shares" +
        "\n\n" + displayPortofolio() + Color.RESET +
        "\n  Funds Left\t" + Color.GREEN + "$" + round(this.getFunds()) + Color.RESET;
    }


}
