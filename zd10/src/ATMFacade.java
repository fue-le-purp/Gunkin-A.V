// Фасад для банкомата
class ATMFacade {
    private Account account;

    public ATMFacade(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Текущий баланс: " + account.getBalance() + " рублей");
    }

    public void withdrawCash(double amount) {
        account.withdraw(amount);
    }

    public void depositCash(double amount) {
        account.deposit(amount);
    }
}
