package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelAgentFunction {

	private static InfoView view;

	public TravelAgentFunction() {
		view = new InfoView();
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeTransport typeTransport,
			TypeOfFood typeOfFood, int amountDay) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getTransport() == typeTransport
						&& agent.getDatabaseTravel().get(index).getFood() == typeOfFood
						&& agent.getDatabaseTravel().get(index).getAmountDay() == amountDay) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}
		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeTransport typeTransport,
			TypeOfFood typeOfFood) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getTransport() == typeTransport
						&& agent.getDatabaseTravel().get(index).getFood() == typeOfFood) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}
		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeTransport typeTransport, int amountDay) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getTransport() == typeTransport
						&& agent.getDatabaseTravel().get(index).getAmountDay() == amountDay) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		// вывод ошибки
		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeOfFood typeOfFood, int amountDay) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getFood() == typeOfFood
						&& agent.getDatabaseTravel().get(index).getAmountDay() == amountDay) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher) {
					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeTransport typeTransport) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getTransport() == typeTransport) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, TypeOfFood typeOfFood) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getFood() == typeOfFood) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		InfoView.error();

		return null;
	}

	public ArrayList<TravelVoucher> typeVoucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, int amountDay) {

		ArrayList<TravelVoucher> vouchers = new ArrayList<>();

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).getTypeVoucher() == typeVoucher
						&& agent.getDatabaseTravel().get(index).getAmountDay() == amountDay) {

					vouchers.add(agent.getDatabaseTravel().get(index));
				}
			}

			if (vouchers.size() != 0) {
				view.travelVoucherSearchShow(vouchers);
				return vouchers;

			} else {
				view.badSearch();
				return null;
			}

		}
		InfoView.error();

		return null;
	}

	public TravelVoucher voucherSearch(TravelAgent agent,
			TypeVoucher typeVoucher, String country,
			TypeTransport typeTransport, TypeOfFood typeOfFood, int amountDay,
			double prise) {

		TravelVoucher voucher = new TravelVoucher(typeVoucher, country,
				typeOfFood, typeTransport, amountDay, prise);

		if (agent != null) {

			for (int index = 0; index < agent.getDatabaseTravel().size(); index++) {

				if (agent.getDatabaseTravel().get(index).equals(voucher)) {
					view.travelVoucherShow(voucher);
					return voucher;
				}
			}

			view.badSearch();
			return null;
		}
		InfoView.error();

		return null;
	}

	public void countrySort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel());
			view.travelVoucherSearchShow(agent.getDatabaseTravel());

			return;
		}
		InfoView.error();
	}

	public void typeVoucherSort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel(),
					new Comparator<TravelVoucher>() {
						@Override
						public int compare(TravelVoucher voucher1,
								TravelVoucher voucher2) {
							// TODO Auto-generated method stub
							return voucher1.getTypeVoucher().compareTo(
									voucher2.getTypeVoucher());
						}
					});

			view.travelVoucherAllShow(agent.getDatabaseTravel());
			return;

		}
		InfoView.error();
	}

	public void typeOfFoodSort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel(),
					new Comparator<TravelVoucher>() {
						@Override
						public int compare(TravelVoucher voucher1,
								TravelVoucher voucher2) {
							// TODO Auto-generated method stub
							return voucher1.getFood().compareTo(
									voucher2.getFood());
						}
					});

			view.travelVoucherAllShow(agent.getDatabaseTravel());
			return;

		}
		InfoView.error();
	}

	public void typeTransportSort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel(),
					new Comparator<TravelVoucher>() {
						@Override
						public int compare(TravelVoucher voucher1,
								TravelVoucher voucher2) {
							// TODO Auto-generated method stub
							return voucher1.getTransport().compareTo(
									voucher2.getTransport());
						}
					});

			view.travelVoucherAllShow(agent.getDatabaseTravel());
			return;

		}
		InfoView.error();
	}

	public void amountDaySort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel(),
					new Comparator<TravelVoucher>() {
						@Override
						public int compare(TravelVoucher voucher1,
								TravelVoucher voucher2) {
							// TODO Auto-generated method stub
							return voucher1.getAmountDay()
									- voucher2.getAmountDay();
						}
					});

			view.travelVoucherAllShow(agent.getDatabaseTravel());
			return;

		}
		InfoView.error();
	}

	public void priseSort(TravelAgent agent) {

		if (agent != null) {

			Collections.sort(agent.getDatabaseTravel(),
					new Comparator<TravelVoucher>() {
						@Override
						public int compare(TravelVoucher voucher1,
								TravelVoucher voucher2) {
							// TODO Auto-generated method stub
							return (int) (voucher1.getPrice() - voucher2
									.getPrice());
						}
					});

			view.travelVoucherAllShow(agent.getDatabaseTravel());
			return;
		}
		InfoView.error();
	}
}