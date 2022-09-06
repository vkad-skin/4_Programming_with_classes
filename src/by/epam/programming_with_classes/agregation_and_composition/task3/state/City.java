package by.epam.programming_with_classes.agregation_and_composition.task3.state;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class City {

	private String cityName;
	private double cityPopulation;
	private double citySquare;

	private boolean isDistrictCenter;
	private boolean isRegionalCenter;
	private boolean isCapitalCity;

	public City() {
		super();
		this.cityName = null;
		this.cityPopulation = 0;
		this.isDistrictCenter = false;
		this.isRegionalCenter = false;
		this.isCapitalCity = false;
	}

	public City(String cityName, double cityPopulation, double citySquare) {
		super();
		this.cityName = cityName;
		this.cityPopulation = cityPopulation;
		this.citySquare = citySquare;
		this.isDistrictCenter = false;
		this.isRegionalCenter = false;
		this.isCapitalCity = false;
	}

	public City(String cityName, double cityPopulation,
			boolean isDistrictCenter, boolean isRegionalCenter,
			boolean isCapitalCity) {
		super();
		this.cityName = cityName;
		this.cityPopulation = cityPopulation;
		this.isDistrictCenter = isDistrictCenter;
		this.isRegionalCenter = isRegionalCenter;
		this.isCapitalCity = isCapitalCity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getCityPopulation() {
		return cityPopulation;
	}

	public void setCityPopulation(double cityPopulation) {
		this.cityPopulation = cityPopulation;
	}

	public boolean isDistrictCenter() {
		return isDistrictCenter;
	}

	public double getCitySquare() {
		return citySquare;
	}

	public void setCitySquare(double citySquare) {
		this.citySquare = citySquare;
	}

	public void setDistrictCenter(boolean isDistrictCenter) {
		this.isDistrictCenter = isDistrictCenter;
	}

	public boolean isRegionalCenter() {
		return isRegionalCenter;
	}

	public void setRegionalCenter(boolean isRegionalCenter) {
		this.isRegionalCenter = isRegionalCenter;
	}

	public boolean isCapitalCity() {
		return isCapitalCity;
	}

	public void setCapitalCity(boolean isCapitalCity) {
		this.isCapitalCity = isCapitalCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cityName == null) ? 0 : cityName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cityPopulation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isCapitalCity ? 1231 : 1237);
		result = prime * result + (isDistrictCenter ? 1231 : 1237);
		result = prime * result + (isRegionalCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (Double.doubleToLongBits(cityPopulation) != Double
				.doubleToLongBits(other.cityPopulation))
			return false;
		if (isCapitalCity != other.isCapitalCity)
			return false;
		if (isDistrictCenter != other.isDistrictCenter)
			return false;
		if (isRegionalCenter != other.isRegionalCenter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityPopulation="
				+ cityPopulation + ", isDistrictCenter=" + isDistrictCenter
				+ ", isRegionalCenter=" + isRegionalCenter + ", isCapitalCity="
				+ isCapitalCity + "]";
	}
}