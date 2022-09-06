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

public class BookLogic {

	public Book[] cratedArrayBook() {

		Book[] books = new Book[5];

		books[0] = new Book(1, "Drive", "Rain Gosling", "Dom pechati", 2010,
				323, 10, "Tverdu");
		books[1] = new Book(2, "Raning 2047", "Rain Gosling", "Belpechat",
				2008, 456, 14, "Mughi");
		books[2] = new Book(3, "Mumu", "Ivan Turgenev", "Belpechat", 1980, 128,
				8, "Tverdu");
		books[3] = new Book(4, "Gore ot yma", "Alex Griboedov", "Dom pechati",
				1979, 86, 10, "Mughi");
		books[4] = new Book(5, "Otchi i deti", "Ivan Turgenev", "Dom pechati",
				1992, 323, 10, "Tverdu");

		return books;
	}

	public void authorSearch(Book[] books, String author) {

		if ((books != null) && (!isEmtyBook(books))) {

			for (int indexBook = 0; indexBook < books.length; indexBook++) {

				if (books[indexBook].getAuthor().compareToIgnoreCase(author) == 0) {
					BookShow.showBook(books[indexBook]);
				}
			}

		} else {
			BookShow.showError();
		}
	}

	public void publishingOfficeSearch(Book[] books, String publishingOffice) {

		if ((books != null) && (!isEmtyBook(books))) {

			for (int indexBook = 0; indexBook < books.length; indexBook++) {

				if (books[indexBook].getPublishingOffice().compareTo(
						publishingOffice) == 0) {
					BookShow.showBook(books[indexBook]);
				}
			}

		} else {
			BookShow.showError();
		}
	}

	public void yearOfPublishingAfterSearch(Book[] books, int yearOfPublishing) {

		if ((books != null) && (!isEmtyBook(books))) {

			for (int indexBook = 0; indexBook < books.length; indexBook++) {

				if (books[indexBook].getYearOfPublishing() > yearOfPublishing) {
					BookShow.showBook(books[indexBook]);
				}
			}

		} else {
			BookShow.showError();
		}
	}

	public boolean isEmtyBook(Book[] books) {

		boolean isEmty;

		isEmty = false;

		for (Book book : books) {
			if (book == null) {
				isEmty = true;
			}
		}

		return isEmty;
	}
}
