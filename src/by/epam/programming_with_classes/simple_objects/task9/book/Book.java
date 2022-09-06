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

public class Book {

	private int id;
	private String nameBook;
	private String author;
	private String publishingOffice;
	private int yearOfPublishing;
	private int numberOfPages;
	private int price;
	private String bindingType;

	public Book() {
		super();
		this.id = 0;
		this.nameBook = "Unknow";
		this.author = "Unknow";
		this.publishingOffice = "Unknow";
		this.yearOfPublishing = 0;
		this.numberOfPages = 0;
		this.price = 0;
		this.bindingType = "Unknow";
	}

	public Book(int id, String nameBook, String author,
			String publishingOffice, int yearOfPublishing, int numberOfPages,
			int price, String bindingType) {

		super();
		this.id = id;
		this.nameBook = nameBook;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingOffice() {
		return publishingOffice;
	}

	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String toString() {
		return "Book >> id =" + getId() + ", nameBook = " + getNameBook()
				+ ", author = " + getAuthor() + ", publishingOffice = "
				+ getPublishingOffice() + ", yearOfPublishing = "
				+ getYearOfPublishing() + ", numberOfPages = "
				+ getNumberOfPages() + ", price = " + getPrice()
				+ ", bindingType=" + getBindingType();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result
				+ ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((nameBook == null) ? 0 : nameBook.hashCode());
		result = prime * result + numberOfPages;
		result = prime * result + price;
		result = prime
				* result
				+ ((publishingOffice == null) ? 0 : publishingOffice.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (nameBook == null) {
			if (other.nameBook != null)
				return false;
		} else if (!nameBook.equals(other.nameBook))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publishingOffice == null) {
			if (other.publishingOffice != null)
				return false;
		} else if (!publishingOffice.equals(other.publishingOffice))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

}
