package by.epam.programming_with_classes.simple_objects.task8.customer;

/*
 * Задание 8: Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами 
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
 * Найти и вывести:  
 * 		a) список покупателей в алфавитном порядке;  
 * 		b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long creditCardNumber;
	private long bankAccountNumber;

	public Customer(int id, String surname, String name, String patronymic,
			String address, long creditCardNumber, long bankAccountNumber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public int compareToCustomer(Customer customer) {

		int result;

		result = this.surname.compareTo(customer.getSurname());

		if (result == 0) {
			result = this.name.compareTo(customer.getName());

			if (result == 0) {
				result = this.patronymic.compareTo(customer.getPatronymic());
			}
		}

		return result;
	}

	@Override
	public String toString() {
		return "Customer >> id = " + getId() + ", surname = " + getSurname()
				+ ", name = " + getName() + ", patronymic = " + getPatronymic()
				+ ", address = " + getAddress() + ", creditCardNumber = "
				+ getCreditCardNumber() + ", bankAccountNumber = "
				+ getBankAccountNumber();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ (int) (bankAccountNumber ^ (bankAccountNumber >>> 32));
		result = prime * result
				+ (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
}