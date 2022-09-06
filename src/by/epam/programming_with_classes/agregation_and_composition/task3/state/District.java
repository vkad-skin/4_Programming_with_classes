package by.epam.programming_with_classes.agregation_and_composition.task3.state;

import java.util.Arrays;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class District {

	private String districtName;
	private double districSquare;
	private City districtCenter;
	private City[] cities;

	public District() {
		super();
		this.districtName = null;
		this.districtCenter = null;
		this.cities = null;
	}

	public District(String districtName, double districSquare,
			City districtCenter, City[] cities) {
		super();
		this.districtName = districtName;
		this.districSquare = districSquare;
		this.districtCenter = districtCenter;
		this.cities = cities;
	}

	public District(String districtName, double districSquare, City[] cities) {
		super();
		this.districtName = districtName;
		this.districSquare = districSquare;
		this.cities = cities;

		for (City city : cities) {
			if (city.isDistrictCenter()) {
				this.districtCenter = city;
			}
		}
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getDistricSquare() {
		return districSquare;
	}

	public void setDistricSquare(double districSquare) {
		this.districSquare = districSquare;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cities);
		long temp;
		temp = Double.doubleToLongBits(districSquare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((districtCenter == null) ? 0 : districtCenter.hashCode());
		result = prime * result
				+ ((districtName == null) ? 0 : districtName.hashCode());
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
		District other = (District) obj;
		if (!Arrays.equals(cities, other.cities))
			return false;
		if (Double.doubleToLongBits(districSquare) != Double
				.doubleToLongBits(other.districSquare))
			return false;
		if (districtCenter == null) {
			if (other.districtCenter != null)
				return false;
		} else if (!districtCenter.equals(other.districtCenter))
			return false;
		if (districtName == null) {
			if (other.districtName != null)
				return false;
		} else if (!districtName.equals(other.districtName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", districSquare="
				+ districSquare + ", districtCenter=" + districtCenter
				+ ", cities=" + Arrays.toString(cities) + "]";
	}
}
