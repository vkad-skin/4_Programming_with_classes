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

public class Main {

	public static void main(String[] args) {

		BookLogic logic = new BookLogic();

		Book[] books = logic.cratedArrayBook();

		logic.authorSearch(books, "Ivan Turgenev");
		System.out.println();

		logic.publishingOfficeSearch(books, "Belpechat");
		System.out.println();

		logic.yearOfPublishingAfterSearch(books, 1980);
	}

}