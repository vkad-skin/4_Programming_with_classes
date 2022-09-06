package by.epam.programming_with_classes.agregation_and_composition.task4.bank_account;

/*
 * Задание 4: Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class CustomerInfoShow {

	public CustomerInfoShow() {
		// TODO Auto-generated constructor stub
	}

	public static void showBankAccountBlocking(BankAccount account) {

		if (account != null) {

			if (account.isAccountBlocking()) {
				System.out.println("Счет заблокирован!");
			} else {
				System.out.println("Счет разблокирован!");
			}

		} else {
			System.out.println("Счета не существует!");
		}
	}

	public static void showEror() {

		System.out.println("Ошибка!");
	}

	public void showCustomer(Customer customer) {

		if (customer != null) {
			System.out.println("Пользователь >> Id: " + customer.getId()
					+ " Пользователь : " + customer.getName()
					+ " Коэф. надежности : " + customer.getSafetyFactor());

			for (BankAccount account : customer.getAccounts()) {
				showBankAccount(account);
			}

		} else {
			System.out.println("Пользователя не существует!");
		}
	}

	public void showBankAccount(BankAccount account) {

		if (account != null) {
			System.out.println("|Счет : " + account.getBankAccountNumber()
					+ "| Деньги на счете : " + account.getMoney()
					+ "| Блокировка : " + account.isAccountBlocking() + " |");
		} else {
			System.out.println("Счета не существует!");
		}
	}

	public void showMoney(double money) {

		System.out.println("Деньги : " + money);
	}
}
