package by.epam.programming_with_classes.agregation_and_composition.task2.car;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Wheel {

	private String diskType;
	private int diskDiameter;
	private String tireType;
	private int tireSize;

	public Wheel() {

		this.diskType = null;
		this.diskDiameter = 0;
		this.tireType = null;
		this.tireSize = 0;

	}

	public Wheel(String diskType, int diskDiameter, String tireType,
			int tireSize) {
		super();
		this.diskType = diskType;
		this.diskDiameter = diskDiameter;
		this.tireType = tireType;
		this.tireSize = tireSize;
	}

	public String getDiskType() {
		return diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}

	public int getDiskDiameter() {
		return diskDiameter;
	}

	public void setDiskDiameter(int diskDiameter) {
		this.diskDiameter = diskDiameter;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	public int getTireSize() {
		return tireSize;
	}

	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskDiameter;
		result = prime * result
				+ ((diskType == null) ? 0 : diskType.hashCode());
		result = prime * result + tireSize;
		result = prime * result
				+ ((tireType == null) ? 0 : tireType.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diskDiameter != other.diskDiameter)
			return false;
		if (diskType == null) {
			if (other.diskType != null)
				return false;
		} else if (!diskType.equals(other.diskType))
			return false;
		if (tireSize != other.tireSize)
			return false;
		if (tireType == null) {
			if (other.tireType != null)
				return false;
		} else if (!tireType.equals(other.tireType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diskType=" + diskType + ", diskDiameter=" + diskDiameter
				+ ", tireType=" + tireType + ", tireSize=" + tireSize + "]";
	}

}
