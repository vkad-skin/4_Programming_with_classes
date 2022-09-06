package by.epam.programming_with_classes.agregation_and_composition.task5.travel_voucher;

import java.util.ArrayList;

/*
 * Задание 5: Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelAgent {

	private String agentName;
	private ArrayList<TravelVoucher> databaseTravel;

	public TravelAgent() {
		super();
		agentName = null;
		databaseTravel = new ArrayList<>();
	}

	public TravelAgent(String agentName) {
		super();
		this.agentName = agentName;
		databaseTravel = new ArrayList<>();
	}

	public TravelAgent(String agentName, ArrayList<TravelVoucher> databaseTravel) {
		super();
		this.agentName = agentName;
		this.databaseTravel = databaseTravel;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public ArrayList<TravelVoucher> getDatabaseTravel() {
		return databaseTravel;
	}

	public void setDatabaseTravel(ArrayList<TravelVoucher> databaseTravel) {
		this.databaseTravel = databaseTravel;
	}

	public void addTravelVoucher(TravelVoucher voucher) {
		databaseTravel.add(voucher);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agentName == null) ? 0 : agentName.hashCode());
		result = prime * result
				+ ((databaseTravel == null) ? 0 : databaseTravel.hashCode());
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
		TravelAgent other = (TravelAgent) obj;
		if (agentName == null) {
			if (other.agentName != null)
				return false;
		} else if (!agentName.equals(other.agentName))
			return false;
		if (databaseTravel == null) {
			if (other.databaseTravel != null)
				return false;
		} else if (!databaseTravel.equals(other.databaseTravel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelAgent [agentName=" + agentName + ", databaseTravel="
				+ databaseTravel + "]";
	}

}