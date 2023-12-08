// Класс для управления операциями счета
class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Счет пополнен на: " + amount + " рублей. Текущий баланс: " + balance + " рублей");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снято со счета: " + amount + " рублей. Текущий баланс: " + balance + " рублей");
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }
}
