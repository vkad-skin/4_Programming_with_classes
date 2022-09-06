package by.epam.programming_with_classes.simple_objects.task9.book;

/*
 * Задание 9: Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
 * метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и 
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 * Найти и вывести:  
 * 		a) список книг заданного автора;  
 * 		b) список книг, выпущенных заданным издательством;  
 * 		c) список книг, выпущенных после заданного года.
 */

public class BookShow {

	public static void showBook(Book book) {
		
		System.out.println("Book >> id =" + book.getId() 
				+ ", nameBook = " + book.getNameBook() 
				+ ", author = " + book.getAuthor() 
				+ ", publishingOffice = " + book.getPublishingOffice()
				+ ", yearOfPublishing = " + book.getYearOfPublishing() 
				+ ", numberOfPages = " + book.getNumberOfPages() 
				+ ", price = " + book.getPrice() 
				+ ", bindingType=" + book.getBindingType());
	}
	
	public static void showBookArray(Book[] books) {

		for (Book book : books) {
			showBook(book);
		}
	}

	public static void showError() {
		System.out.println("Error!");
	}
}