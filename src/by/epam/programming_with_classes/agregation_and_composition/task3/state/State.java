package by.epam.programming_with_classes.agregation_and_composition.task3.state;

import java.util.Arrays;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class State {

	private String stateName;
	private String formOfGovernment;
	private double stateSquare;
	private City stateCenter;
	private Region[] regions;

	public State() {
		super();
		this.stateName = null;
		this.formOfGovernment = null;
		this.stateSquare = 0;
		this.stateCenter = null;
		this.regions = null;
	}

	public State(String stateName, String formOfGovernment, Region[] regions) {
		super();
		this.stateName = stateName;
		this.formOfGovernment = formOfGovernment;

		for (Region region : regions) {
			this.stateSquare += region.getRegionSquare();

			for (District district : region.getDistricts()) {

				for (City city : district.getCities()) {
					if (city.isDistrictCenter() && city.isRegionalCenter()
							&& city.isCapitalCity()) {
						this.stateCenter = city;
					}
				}
			}
		}
		this.regions = regions;
	}

	public State(String stateName, String formOfGovernment, City stateCenter,
			Region[] regions) {
		super();
		this.stateName = stateName;
		this.formOfGovernment = formOfGovernment;

		for (Region region : regions) {
			this.stateSquare += region.getRegionSquare();
		}

		this.stateCenter = stateCenter;
		this.regions = regions;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getFormOfGovernment() {
		return formOfGovernment;
	}

	public void setFormOfGovernment(String formOfGovernment) {
		this.formOfGovernment = formOfGovernment;
	}

	public double getStateSquare() {
		return stateSquare;
	}

	public void setStateSquare(double stateSquare) {
		this.stateSquare = stateSquare;
	}

	public City getStateCenter() {
		return stateCenter;
	}

	public void setStateCenter(City stateCenter) {
		this.stateCenter = stateCenter;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((formOfGovernment == null) ? 0 : formOfGovernment.hashCode());
		result = prime * result + Arrays.hashCode(regions);
		result = prime * result
				+ ((stateCenter == null) ? 0 : stateCenter.hashCode());
		result = prime * result
				+ ((stateName == null) ? 0 : stateName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stateSquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		State other = (State) obj;
		if (formOfGovernment == null) {
			if (other.formOfGovernment != null)
				return false;
		} else if (!formOfGovernment.equals(other.formOfGovernment))
			return false;
		if (!Arrays.equals(regions, other.regions))
			return false;
		if (stateCenter == null) {
			if (other.stateCenter != null)
				return false;
		} else if (!stateCenter.equals(other.stateCenter))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		if (Double.doubleToLongBits(stateSquare) != Double
				.doubleToLongBits(other.stateSquare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", formOfGovernment="
				+ formOfGovernment + ", stateSquare=" + stateSquare
				+ ", stateCenter=" + stateCenter + ", regions="
				+ Arrays.toString(regions) + "]";
	}
}
