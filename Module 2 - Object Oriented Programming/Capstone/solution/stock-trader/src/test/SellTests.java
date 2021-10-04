package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.model.Trade;
import src.main.model.Trade.Stock;
import src.main.model.Trade.Type;
import src.main.model.account.Account;
import src.main.model.account.Personal;
import src.main.model.account.TFSA;

public class SellTests {
    
    Account[] accounts;

    @Before
    public void setup() {
        accounts = new Account[] { new Personal(1000), new TFSA(1000)};
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].makeTrade(new Trade(Stock.AAPL, Type.MARKET_BUY, 15.649286, 5));
        }
    }

    @Test
    public void personalShares() {
        accounts[0].makeTrade(new Trade(Stock.AAPL, Type.MARKET_SELL, 15.649286, 3));
        assertEquals(accounts[0].getShares(Stock.AAPL), 2);
    }

    @Test
    public void tfsaShares() {
        accounts[1].makeTrade(new Trade(Stock.AAPL, Type.MARKET_SELL, 15.649286, 5));
        assertEquals(accounts[1].getShares(Stock.AAPL), 0);
    }

    @Test
    public void insuffientShares() {
        accounts[0].makeTrade(new Trade(Stock.AAPL, Type.MARKET_SELL, 15.649286, 6));
        assertEquals(accounts[0].getShares(Stock.AAPL), 5);
    }

    @Test
    public void personalFunds() {
        double currentBalance = accounts[0].getFunds();

        accounts[0].makeTrade(new Trade(Stock.AAPL, Type.MARKET_SELL, 15.649286, 5));
        assertEquals(accounts[0].getFunds(), currentBalance + (15.649286 * 5) - (15.649286 * 5 * Personal.SELL_FEE));
    }

    @Test
    public void TFSAFunds() {
        double currentBalance = accounts[1].getFunds();

        accounts[1].makeTrade(new Trade(Stock.AAPL, Type.MARKET_SELL, 15.649286, 5));
        assertEquals(accounts[1].getFunds(), currentBalance + (15.649286 * 5) - (15.649286 * 5 * TFSA.TRADE_FEE));
    }

}
