package by.epam.programming_with_classes.agregation_and_composition.task3.state;

import java.util.Arrays;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class Region {

	private String regionName;
	private double regionSquare;
	private City regionCenter;
	private District[] districts;

	public Region() {
		super();
		this.regionName = null;
		this.regionSquare = 0;
		this.regionCenter = null;
		this.districts = null;
	}

	public Region(String regionName, District[] districts) {
		super();
		this.regionName = regionName;

		for (District district : districts) {
			this.regionSquare += district.getDistricSquare();

			for (City city : district.getCities()) {
				if (city.isDistrictCenter() && city.isRegionalCenter()) {
					this.regionCenter = city;
				}
			}
		}
		this.districts = districts;
	}

	public Region(String regionName, City regionCenter, District[] districts) {
		super();
		this.regionName = regionName;

		for (District district : districts) {
			this.regionSquare += district.getDistricSquare();
		}

		this.regionCenter = regionCenter;
		this.districts = districts;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public double getRegionSquare() {
		return regionSquare;
	}

	public void setRegionSquare(double regionSquare) {
		this.regionSquare = regionSquare;
	}

	public City getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City regionCenter) {
		this.regionCenter = regionCenter;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(districts);
		result = prime * result
				+ ((regionCenter == null) ? 0 : regionCenter.hashCode());
		result = prime * result
				+ ((regionName == null) ? 0 : regionName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(regionSquare);
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
		Region other = (Region) obj;
		if (!Arrays.equals(districts, other.districts))
			return false;
		if (regionCenter == null) {
			if (other.regionCenter != null)
				return false;
		} else if (!regionCenter.equals(other.regionCenter))
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		if (Double.doubleToLongBits(regionSquare) != Double
				.doubleToLongBits(other.regionSquare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regionSquare="
				+ regionSquare + ", regionCenter=" + regionCenter
				+ ", districts=" + Arrays.toString(districts) + "]";
	}
}
