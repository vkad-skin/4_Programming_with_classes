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

public class CustomerShow {
	
	public static void showCustomerArray(Customer[] customers) {
		
		for(Customer customer:customers) {
			
			System.out.println("Customer >> id = " + customer.getId() 
					+ ", surname = " + customer.getSurname() 
					+ ", name = " + customer.getName()
					+ ", patronymic = " + customer.getPatronymic() 
					+ ", address = " + customer.getAddress()
					+ ", creditCardNumber = " + customer.getCreditCardNumber()
					+ ", bankAccountNumber = " + customer.getBankAccountNumber());
		}
	}
	
	public static void showCustomer(Customer customer) {
		
		System.out.println("Customer >> id = " + customer.getId() 
				+ ", surname = " + customer.getSurname() 
				+ ", name = " + customer.getName()
				+ ", patronymic = " + customer.getPatronymic() 
				+ ", address = " + customer.getAddress()
				+ ", creditCardNumber = " + customer.getCreditCardNumber()
				+ ", bankAccountNumber = " + customer.getBankAccountNumber());
	}
	
	public static void showErrorSearch() {
		System.out.println("Error search!");
	}
	
	public static void showError() {
		System.out.println("Error!");
	}
}