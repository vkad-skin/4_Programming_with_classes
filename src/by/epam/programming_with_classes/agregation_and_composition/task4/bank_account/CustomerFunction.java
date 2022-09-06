package by.epam.programming_with_classes.agregation_and_composition.task4.bank_account;

/*
 * Задание 4: Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class CustomerFunction {

	public CustomerFunction() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount bankAccountSearch(Customer customer,
			long bankAccountNumber) {

		if (customer != null) {

			if (customer.getAccounts() != null) {

				for (BankAccount bankAccount : customer.getAccounts()) {
					if (bankAccount.getBankAccountNumber() == bankAccountNumber) {
						return bankAccount;
					}
				}
			}
		} else {
			CustomerInfoShow.showEror();
		}
		return null;
	}

	public void bankAccountSorting(Customer customer) {

		if (customer != null) {

			if (customer.getAccounts() != null) {

				int accountIndex = 0;

				while (true) {

					if (customer.getAccounts()[accountIndex]
							.getBankAccountNumber() > customer.getAccounts()[accountIndex + 1]
							.getBankAccountNumber()) {

						bankAccountSwap(customer.getAccounts(), accountIndex,
								accountIndex + 1);

						if (accountIndex > 0) {
							accountIndex--;
						}

					} else {
						accountIndex++;
					}

					if (customer.getAccounts().length - 1 == accountIndex) {
						break;
					}
				}

			} else {
				CustomerInfoShow.showEror();
			}

		} else {
			CustomerInfoShow.showEror();
		}
	}

	private void bankAccountSwap(BankAccount[] accounts, int indexBankAccount,
			int indexBankAccountSwap) {

		BankAccount boxAccount;

		boxAccount = accounts[indexBankAccount];
		accounts[indexBankAccount] = accounts[indexBankAccountSwap];
		accounts[indexBankAccountSwap] = boxAccount;
	}

	public double bankAccountBalanceAll(Customer customer) {

		double moneyAll = 0;

		if (customer != null) {

			for (BankAccount bankAccount : customer.getAccounts()) {
				moneyAll += bankAccount.getMoney();
			}

		} else {
			CustomerInfoShow.showEror();
		}
		return moneyAll;
	}

	public double bankAccountBalancePositiveAll(Customer customer) {

		double moneyAll = 0;

		if (customer != null) {

			for (BankAccount bankAccount : customer.getAccounts()) {

				if (bankAccount.getMoney() >= 0) {
					moneyAll += bankAccount.getMoney();
				}
			}
		} else {
			CustomerInfoShow.showEror();
		}
		return moneyAll;
	}

	public double bankAccountBalanceNegativeAll(Customer customer) {

		double moneyAll = 0;

		if (customer != null) {

			for (BankAccount bankAccount : customer.getAccounts()) {

				if (bankAccount.getMoney() < 0) {
					moneyAll += bankAccount.getMoney();
				}
			}
		} else {
			CustomerInfoShow.showEror();
		}
		return moneyAll;
	}

	public void bankAccountBlocking(BankAccount account, boolean block) {

		if (account != null) {
			account.setAccountBlocking(block);
			CustomerInfoShow.showBankAccountBlocking(account);

		} else {
			CustomerInfoShow.showEror();
		}
	}

	public void addMoney(BankAccount account, double money) {

		if (account != null) {

			if (!account.isAccountBlocking()) {
				account.setMoney(account.getMoney() + money);
			} else {
				CustomerInfoShow.showBankAccountBlocking(account);
			}
		} else {
			CustomerInfoShow.showEror();
		}
	}
}