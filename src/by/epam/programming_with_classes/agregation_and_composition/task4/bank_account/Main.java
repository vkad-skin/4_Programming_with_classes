package by.epam.programming_with_classes.agregation_and_composition.task4.bank_account;

/*
 * Задание 4: Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer(1, "Braskov A.E.");
		CustomerFunction function = new CustomerFunction();
		CustomerInfoShow view = new CustomerInfoShow();

		BankAccount account1 = new BankAccount(2234L, 10, false);
		BankAccount account2 = new BankAccount(1234L, 11, false);
		BankAccount account3 = new BankAccount(7643L, -4, true);

		customer1.setAccounts(new BankAccount[] { account1, account2 });
		view.showCustomer(customer1);
		System.out.println();

		customer1.addAccounts(account3);
		view.showCustomer(customer1);
		System.out.println();

		function.bankAccountSorting(customer1);
		view.showCustomer(customer1);
		System.out.println();

		view.showBankAccount(function.bankAccountSearch(customer1, 7643L));
		System.out.println();

		view.showMoney(function.bankAccountBalanceAll(customer1));
		view.showMoney(function.bankAccountBalancePositiveAll(customer1));
		view.showMoney(function.bankAccountBalanceNegativeAll(customer1));

		function.bankAccountBlocking(account3, false);
		System.out.println();

		view.showCustomer(customer1);
	}
}