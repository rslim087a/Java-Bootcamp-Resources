package src.main.model.account;


import src.main.model.Trade;

public class Personal extends Account {

    public static final double SELL_FEE = 0.05;

    public Personal(double funds) {
        super(funds);
    }

    public Personal(Personal source) {
        super(source);
    }

    @Override
    public Account clone() {
        return new Personal(this);
    }

    public boolean makeTrade(Trade trade) {
        return Trade.Type.MARKET_BUY == trade.getType() ? super.executePurchase(trade, 0) : super.executeSale(trade, SELL_FEE);
    }

}
