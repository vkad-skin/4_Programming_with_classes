package by.epam.programming_with_classes.agregation_and_composition.task4.bank_account;

/*
 * Задание 4: Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
 * всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */

public class BankAccount {

	private long bankAccountNumber;
	private double money;
	private boolean accountBlocking;

	public BankAccount() {
		this.bankAccountNumber = 0L;
		this.money = 0;
		this.accountBlocking = true;
	}

	public BankAccount(long bankAccountNumber) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.money = 0;
		this.accountBlocking = false;
	}

	public BankAccount(long bankAccountNumber, double money,
			boolean accountBlocking) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.money = money;
		this.accountBlocking = accountBlocking;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public boolean isAccountBlocking() {
		return accountBlocking;
	}

	public void setAccountBlocking(boolean accountBlocking) {
		this.accountBlocking = accountBlocking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accountBlocking ? 1231 : 1237);
		result = prime * result
				+ (int) (bankAccountNumber ^ (bankAccountNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(money);
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
		BankAccount other = (BankAccount) obj;
		if (accountBlocking != other.accountBlocking)
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (Double.doubleToLongBits(money) != Double
				.doubleToLongBits(other.money))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNumber=" + bankAccountNumber
				+ ", money=" + money + ", accountBlocking=" + accountBlocking
				+ "]";
	}
}