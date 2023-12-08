// Главный класс Main
public class Main {
    public static void main(String[] args) {
        // Создание объекта счета
        Account account = new Account(1000.0);

        // Создание фасада для банкомата
        ATMFacade atmFacade = new ATMFacade(account);

        // Использование фасада для операций с банкоматом
        atmFacade.checkBalance(); // Текущий баланс: 1000.0 рублей
        atmFacade.withdrawCash(500.0); // Снято со счета: 500.0 рублей. Текущий баланс: 500.0 рублей
        atmFacade.depositCash(200.0); // Счет пополнен на: 200.0 рублей. Текущий баланс: 700.0 рублей
        atmFacade.checkBalance(); // Текущий баланс: 700.0 рублей
    }
}
