package by.epam.programming_with_classes.agregation_and_composition.task2.car;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Motor {

	private String motorType;
	private int motorPower;
	private double motorVolume;

	public Motor() {
		this.motorType = null;
		this.motorPower = 0;
		this.motorVolume = 0;
	}

	public Motor(String motorType, int motorPower, double motorVolume) {
		super();
		this.motorType = motorType;
		this.motorPower = motorPower;
		this.motorVolume = motorVolume;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public int getMotorPower() {
		return motorPower;
	}

	public void setMotorPower(int motorPower) {
		this.motorPower = motorPower;
	}

	public double getMotorVolume() {
		return motorVolume;
	}

	public void setMotorVolume(double motorVolume) {
		this.motorVolume = motorVolume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + motorPower;
		result = prime * result
				+ ((motorType == null) ? 0 : motorType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(motorVolume);
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
		Motor other = (Motor) obj;
		if (motorPower != other.motorPower)
			return false;
		if (motorType == null) {
			if (other.motorType != null)
				return false;
		} else if (!motorType.equals(other.motorType))
			return false;
		if (Double.doubleToLongBits(motorVolume) != Double
				.doubleToLongBits(other.motorVolume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Motor [motorType=" + motorType + ", motorPower=" + motorPower
				+ ", motorVolume=" + motorVolume + "]";
	}

}
