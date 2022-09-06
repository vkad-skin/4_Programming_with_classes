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

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerLogic customerLogic = new CustomerLogic();

		Customer[] customers = customerLogic.createdCustomers(5);

		customerLogic.sortCustomerInAlphabeticalOrder(customers);
		CustomerShow.showCustomerArray(customers);
		System.out.println();

		customerLogic.searchCreditCardNumber(customers, 5454232364569421L);
		System.out.println();

		customerLogic.searchCreditCardNumber(customers, 5454232364567823L,
				5454232364569421L);
		System.out.println();
	}
}