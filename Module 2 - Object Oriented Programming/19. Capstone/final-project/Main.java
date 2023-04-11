import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import constants.TradeAccountType;
import constants.Transaction;
import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.TradeAccountService;
import service.CashAccountService;
import service.MarginAccountService;

public class Main {

    static Path[] paths = new Path[] {Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt")};
    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void main(String[] args) {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
            .forEach(line -> {
                String[] words = line.split(" ");
                if (words[0].equals(TradeAccountType.CASH.toString())) {
                    cashAccountService.createTradeAccount(new CashAccount(words[1], new BigDecimal(words[2])));
                } else {
                    marginAccountService.createTradeAccount(new MarginAccount(words[1], new BigDecimal(words[2])));
                }
            });
    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
            .forEach(line -> {
                String[] words = line.split(" ");
                Boolean isCash = words[0].equals(TradeAccountType.CASH.toString());
                TradeAccountService tradeAccountService = isCash ? cashAccountService : marginAccountService;
                Transaction transaction = Transaction.valueOf(words[2]);
                if (transaction.equals(Transaction.DEPOSIT)) {
                    tradeAccountService.deposit(words[1], new BigDecimal(words[3]));
                } else {
                    tradeAccountService.withdraw(words[1], new BigDecimal(words[3]));
                }
        });
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }

}
