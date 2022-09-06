package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

import java.util.ArrayList;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Customer {

	private String customerName;
	private TravelVoucher voucher;

	public Customer() {
		super();
		customerName = null;
	}

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public TravelVoucher getVoucher() {
		return voucher;
	}

	public void setVoucher(TravelVoucher voucher) {
		this.voucher = voucher;
	}

	public void buyVoucher(ArrayList<TravelVoucher> vouchers, int buyIndex) {

		if (vouchers != null) {

			if (vouchers.size() >= buyIndex && buyIndex >= 1) {
				setVoucher(vouchers.get(buyIndex - 1));
				return;
			}
		}
		InfoView.error();
	}

	public void buyVoucher(TravelVoucher voucher) {

		if (voucher != null) {
			this.voucher = voucher;
		}
		InfoView.error();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((voucher == null) ? 0 : voucher.hashCode());
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
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (voucher == null) {
			if (other.voucher != null)
				return false;
		} else if (!voucher.equals(other.voucher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", voucher="
				+ voucher + "]";
	}

}
