package pl.sdaacademy.chain_of_responsibility.cash_machine;

public class CashRequest {

    private int amount;

    public CashRequest(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
