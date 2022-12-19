package src.main.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import src.main.model.account.Account;
import src.main.model.account.Chequing;
import src.main.model.account.impl.Taxable;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }

    public Transaction[] getTransactions(String accountId) {
         List<Transaction> list = this.transactions.stream()
        .filter((transaction) -> transaction.getId().equals(accountId))
        .collect(Collectors.toList());

        return list.toArray(new Transaction[list.size()]);
    }

    public Account getAccount(String transactionId) {
        return accounts.stream()
            .filter((account) -> account.getId().equals(transactionId))
            .findFirst()
            .orElse(null);
    }

    public void addAccount(Account account) {
        this.accounts.add(account.clone());
    }

    private void addTransaction(Transaction transaction) {
        this.transactions.add(new Transaction(transaction));
    }

    public void executeTransaction(Transaction transaction) {
        switch (transaction.getType()) {
            case WITHDRAW: withdrawTransaction(transaction); break;
            case DEPOSIT: depositTransaction(transaction); break;
        }
    }

    private void withdrawTransaction(Transaction transaction) {
        if (getAccount(transaction.getId()).withdraw(transaction.getAmount())) {
            addTransaction(transaction);
        }
    }

    private void depositTransaction(Transaction transaction) {
        getAccount(transaction.getId()).deposit(transaction.getAmount());
        addTransaction(transaction);
    }

    private double getIncome(Taxable account) {
        Transaction[] transactions = getTransactions(((Chequing)account).getId());
        return Arrays.stream(transactions)
            .mapToDouble((transaction) -> {
                switch (transaction.getType()) {
                    case WITHDRAW: return -transaction.getAmount();
                    case DEPOSIT: return transaction.getAmount();
                    default: return 0;
                }
            }).sum();
    }

    public void deductTaxes() {
        for (Account account : accounts) {
            if (Taxable.class.isAssignableFrom(account.getClass())) {
                Taxable taxable = (Taxable)account;
                taxable.tax(getIncome(taxable));
            }
        }
    }

}
