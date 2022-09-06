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

public class CustomerLogic {

	public Customer[] createdCustomers(int customerAmount) {

		Customer[] customers = new Customer[customerAmount];

		customers[0] = new Customer(1, "Ivanov", "Michil", "Alexanrov",
				"Naberegnay 15, kv. 15", 5454232364569421L, 381297689L);
		customers[1] = new Customer(2, "Abobeb", "Nina", "Leonidown",
				"Naberegnay 23, kv. 3", 5454232364568021L, 154397689L);
		customers[2] = new Customer(3, "Berig", "Alex", "Ivanova",
				"Lenina 103, kv. 55", 5454232364561234L, 124597689L);
		customers[3] = new Customer(4, "Abobeb", "Nina", "Vitalevna",
				"Gryshevka 3, kv. 130", 5454232364567823L, 109297689L);
		customers[4] = new Customer(5, "Garoc", "Anna", "Alexanrov",
				"Energetikov 77, kv. 4", 545423236459045L, 251297689L);

		return customers;
	}

	public void sortCustomerInAlphabeticalOrder(Customer[] customers) {

		if (customers != null && !isEmtyCustomer(customers)) {

			int indexCustomerArray;

			indexCustomerArray = 0;

			while (true) {

				if (customers[indexCustomerArray]
						.compareToCustomer(customers[indexCustomerArray + 1]) > 0) {

					swapCustomer(customers, indexCustomerArray,
							indexCustomerArray + 1);

					if (indexCustomerArray > 0) {
						indexCustomerArray--;
					}

				} else {
					indexCustomerArray++;
				}

				if (indexCustomerArray == customers.length - 1) {
					break;
				}
			}

		} else {
			CustomerShow.showError();
		}
	}

	public void searchCreditCardNumber(Customer[] customers,
			long creditCardNumber) {

		boolean searchCardNumber;

		searchCardNumber = false;

		for (int indexCustomerArray = 0; indexCustomerArray < customers.length; indexCustomerArray++) {

			if (customers[indexCustomerArray].getCreditCardNumber() == creditCardNumber) {
				CustomerShow.showCustomer(customers[indexCustomerArray]);
				searchCardNumber = true;
			}
		}

		if (!searchCardNumber) {
			CustomerShow.showErrorSearch();
		}

	}

	public void searchCreditCardNumber(Customer[] customers,
			long creditCardNumberMin, long creditCardNumberMax) {

		boolean searchCardNumber;

		searchCardNumber = false;

		for (int indexCustomerArray = 0; indexCustomerArray < customers.length; indexCustomerArray++) {

			if ((customers[indexCustomerArray].getCreditCardNumber() >= creditCardNumberMin)
					&& (customers[indexCustomerArray].getCreditCardNumber() <= creditCardNumberMax)) {
				
				CustomerShow.showCustomer(customers[indexCustomerArray]);
				searchCardNumber = true;
			}
		}

		if (!searchCardNumber) {
			CustomerShow.showErrorSearch();
		}
	}

	public Customer[] swapCustomer(Customer[] customers,
			int indexCustomerArray, int indexCustomerArraySwap) {

		if (customers != null) {

			Customer boxCustomer;

			boxCustomer = customers[indexCustomerArray];
			customers[indexCustomerArray] = customers[indexCustomerArraySwap];
			customers[indexCustomerArraySwap] = boxCustomer;
		}

		return customers;
	}

	public boolean isEmtyCustomer(Customer[] customers) {

		boolean isEmty;

		isEmty = false;

		for (Customer customer : customers) {
			if (customer == null) {
				isEmty = true;
			}
		}

		return isEmty;
	}
}