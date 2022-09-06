package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

import java.util.ArrayList;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class InfoView {

	public void travelVoucherShow(TravelVoucher voucher) {
		if (voucher != null) {
			System.out.println("Voucher >>| Type voucher : " + voucher.getTypeVoucher()
					+ " | Country : " + voucher.getCountry()
					+ " | Food : " + voucher.getFood()
					+ " | Trancport : " + voucher.getTransport()
					+ " | Amount day : " + voucher.getAmountDay()
					+ " | Prise : " + voucher.getPrice() 
					+ " | ");
		} else {
			System.out.println("Voucher >> " + null);
		}
	}
	
	public void travelVoucherShowWithIndex(TravelVoucher voucher, int voucherIndex) {
		if (voucher != null) {
			System.out.println("Voucher >>| Type voucher : " + voucher.getTypeVoucher()
					+ " | Country : " + voucher.getCountry()
					+ " | Food : " + voucher.getFood()
					+ " | Trancport : " + voucher.getTransport()
					+ " | Amount day : " + voucher.getAmountDay()
					+ " | Prise : " + voucher.getPrice() 
					+ " | ");
		} else {
			System.out.println("Voucher >> " + null);
		}
	}
	
	public void travelVoucherAllShow(ArrayList<TravelVoucher> vouchers) {

		if (vouchers != null) {

			for (TravelVoucher voucher : vouchers) {
				travelVoucherShow(voucher);
			}
			System.out.println();

		} else {
			System.out.println("Vouchers >> " + null);
		}
	}
	
	public void travelVoucherSearchShow(ArrayList<TravelVoucher> vouchers) {

		if (vouchers != null) {

			int index = 1;

			for (TravelVoucher voucher : vouchers) {

				System.out.print("( " + index + " ) ");
				travelVoucherShow(voucher);
				index++;
			}
			System.out.println();

		} else {
			System.out.println("Vouchers >> " + null);
		}
	}
	
	public void customerShow(Customer customer) {

		if (customer != null) {
			System.out.print("Customer >> | Name : "
					+ customer.getCustomerName() + " | Buy ");
			travelVoucherShow(customer.getVoucher());
			System.out.println();

		} else {
			System.out.println("Customer >> " + null);
		}
	}
	
	public void TravelAgentShow(TravelAgent agent) {
		
		if (agent != null) {
			System.out.println("Travel Agent >> | Name : " + agent.getAgentName() 
					+ " | Amount Vouchers : " + agent.getDatabaseTravel().size()
					+ " | \n");
			
			
		} else {
			System.out.println("Travel Agent >> " + null);
		}
	}

	public static void error() {
		System.out.println("Error!");
	}

	public void badSearch() {
		System.out.println("Dont search vouchers!");
	}
}