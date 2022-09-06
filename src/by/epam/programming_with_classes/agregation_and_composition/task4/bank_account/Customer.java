package by.epam.programming_with_classes.agregation_and_composition.task4.bank_account;

import java.util.Arrays;

/*
 * Задание 4: Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class Customer {

	private int id;
	private String name;
	private BankAccount[] accounts;
	private double safetyFactor;

	public Customer() {
		super();
		this.id = 0;
		this.name = null;
		this.accounts = null;
		this.safetyFactor = 0;
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.accounts = null;
		this.safetyFactor = 250.0;
	}

	public Customer(int id, String name, BankAccount[] accounts, double safetyFactor) {
		super();
		this.id = id;
		this.name = name;
		this.accounts = accounts;
		this.safetyFactor = safetyFactor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	public void addAccounts(BankAccount account) {

		if (account != null) {

			BankAccount[] accountsNew = new BankAccount[accounts.length + 1];

			for (int accountIndex = 0; accountIndex < accountsNew.length; accountIndex++) {

				if (accountIndex != accountsNew.length - 1) {
					accountsNew[accountIndex] = accounts[accountIndex];
				} else {
					accountsNew[accountIndex] = account;
				}
			}
			setAccounts(accountsNew);
		}
	}

	public double getSafetyFactor() {
		return safetyFactor;
	}

	public void setSafetyFactor(double safetyFactor) {
		this.safetyFactor = safetyFactor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(safetyFactor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (!Arrays.equals(accounts, other.accounts))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(safetyFactor) != Double.doubleToLongBits(other.safetyFactor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", accounts=" + Arrays.toString(accounts) + ", safetyFactor="
				+ safetyFactor + "]";
	}
}
