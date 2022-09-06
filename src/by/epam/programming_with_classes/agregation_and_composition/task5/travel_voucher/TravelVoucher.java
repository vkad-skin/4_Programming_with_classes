package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelVoucher implements Comparable<TravelVoucher> {

	private TypeVoucher typeVoucher;
	private String country;
	private TypeOfFood food;
	private TypeTransport transport;
	private int amountDay;
	private double price;

	public TravelVoucher() {
		super();
		this.typeVoucher = null;
		this.country = null;
		this.food = null;
		this.transport = null;
		this.amountDay = 0;
		this.price = 0;
	}

	public TravelVoucher(TypeVoucher typeVoucher, String country,
			TypeOfFood food, TypeTransport transport, int amountDay,
			double price) {
		super();
		this.typeVoucher = typeVoucher;
		this.country = country;
		this.food = food;
		this.transport = transport;
		this.amountDay = amountDay;
		this.price = price;
	}

	public TypeVoucher getTypeVoucher() {
		return typeVoucher;
	}

	public void setTypeVoucher(TypeVoucher typeVoucher) {
		this.typeVoucher = typeVoucher;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TypeOfFood getFood() {
		return food;
	}

	public void setFood(TypeOfFood food) {
		this.food = food;
	}

	public TypeTransport getTransport() {
		return transport;
	}

	public void setTransport(TypeTransport transport) {
		this.transport = transport;
	}

	public int getAmountDay() {
		return amountDay;
	}

	public void setAmountDay(int amountDay) {
		this.amountDay = amountDay;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(TravelVoucher voucher) {

		int value;

		value = this.getCountry().compareToIgnoreCase(voucher.getCountry());

		if (value == 0) {
			value = this.getTypeVoucher().compareTo(voucher.getTypeVoucher());
		}

		if (value == 0) {
			value = (int) (this.getPrice() - voucher.getPrice());
		}

		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountDay;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((transport == null) ? 0 : transport.hashCode());
		result = prime * result
				+ ((typeVoucher == null) ? 0 : typeVoucher.hashCode());
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
		TravelVoucher other = (TravelVoucher) obj;
		if (amountDay != other.amountDay)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (food != other.food)
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (transport != other.transport)
			return false;
		if (typeVoucher != other.typeVoucher)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelVoucher [typeVoucher=" + typeVoucher + ", country="
				+ country + ", food=" + food + ", transport=" + transport
				+ ", amountDay=" + amountDay + ", price=" + price + "]";
	}

}
