package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

import java.util.ArrayList;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {

		TravelAgent agent = new TravelAgent("Диана А.В.");
		Customer customer = new Customer("Виталий В.А.");
		TravelAgentFunction agentFunction = new TravelAgentFunction();
		InfoView view = new InfoView();

		ArrayList<TravelVoucher> foundVouchers;

		TravelVoucher voucher1 = new TravelVoucher(TypeVoucher.CRUISE,
				"Ispaniy", TypeOfFood.HALF_BOARD, TypeTransport.TRAIN, 7, 200);
		TravelVoucher voucher2 = new TravelVoucher(TypeVoucher.EXCURSION,
				"Germany", TypeOfFood.BREAKFAST, TypeTransport.AUTOBUS, 3, 150);
		TravelVoucher voucher3 = new TravelVoucher(TypeVoucher.REST,
				"Chernogoriu", TypeOfFood.HALF_BOARD, TypeTransport.AIRPLANE,
				10, 300);
		TravelVoucher voucher4 = new TravelVoucher(TypeVoucher.REST, "Maldivu",
				TypeOfFood.ROOM_ONLY, TypeTransport.AIRPLANE, 10, 1000);
		TravelVoucher voucher5 = new TravelVoucher(TypeVoucher.SOPPING, "USA",
				TypeOfFood.ROOM_ONLY, TypeTransport.AIRPLANE, 2, 500);

		agent.addTravelVoucher(voucher1);
		agent.addTravelVoucher(voucher2);
		agent.addTravelVoucher(voucher3);
		agent.addTravelVoucher(voucher4);
		agent.addTravelVoucher(voucher5);

		view.TravelAgentShow(agent);

		view.travelVoucherAllShow(agent.getDatabaseTravel());

		agentFunction.typeVoucherSort(agent);

		foundVouchers = agentFunction.typeVoucherSearch(agent,
				TypeVoucher.REST, TypeTransport.AIRPLANE);

		view.customerShow(customer);
		customer.buyVoucher(foundVouchers, 2);

		view.customerShow(customer);
	}
}