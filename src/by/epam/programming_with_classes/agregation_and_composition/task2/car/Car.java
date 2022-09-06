package by.epam.programming_with_classes.agregation_and_composition.task2.car;

import java.util.Arrays;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Car {

	private Motor motor;
	private Wheel[] wheels;
	private String carBrend;
	private String carModel;
	private String bodyType;
	private final double tankVolume;
	private double fuel;

	public Car() {
		super();
		this.motor = null;
		this.wheels = null;
		this.carBrend = null;
		this.carModel = null;
		this.bodyType = null;
		this.tankVolume = 30;
		this.fuel = 0;
	}

	public Car(String carBrend, String carModel, String bodyType,
			double tankVolume) {
		super();
		this.motor = null;
		this.wheels = null;
		this.carBrend = carBrend;
		this.carModel = carModel;
		this.bodyType = bodyType;

		if (tankVolume > 30) {
			this.tankVolume = tankVolume;
		} else {
			this.tankVolume = 30;
		}

		this.fuel = 0;
	}

	public Car(Motor motor, String carBrend, String carModel, String bodyType,
			double tankVolume, double fuel) {
		super();
		this.motor = motor;
		this.wheels = null;
		this.carBrend = carBrend;
		this.carModel = carModel;
		this.bodyType = bodyType;

		if (tankVolume > 30) {
			this.tankVolume = tankVolume;
		} else {
			this.tankVolume = 30;
		}

		if (fuel > 0) {
			this.fuel = fuel;
		} else {
			this.fuel = 0;
		}
	}

	public Car(Wheel[] wheels, String carBrend, String carModel,
			String bodyType, double tankVolume, double fuel) {
		super();
		this.motor = null;
		this.wheels = wheels;
		this.carBrend = carBrend;
		this.carModel = carModel;
		this.bodyType = bodyType;

		if (tankVolume > 30) {
			this.tankVolume = tankVolume;
		} else {
			this.tankVolume = 30;
		}

		if (fuel > 0) {
			this.fuel = fuel;
		} else {
			this.fuel = 0;
		}
	}

	public Car(Motor motor, Wheel[] wheels, String carBrend, String carModel,
			String bodyType, double tankVolume) {
		super();
		this.motor = motor;
		this.wheels = wheels;
		this.carBrend = carBrend;
		this.carModel = carModel;
		this.bodyType = bodyType;

		if (tankVolume > 30) {
			this.tankVolume = tankVolume;
		} else {
			this.tankVolume = 30;
		}

		this.fuel = 0;
	}

	public Car(Motor motor, Wheel[] wheels, String carBrend, String carModel,
			String bodyType, double fuel, double tankVolume) {
		super();
		this.motor = motor;
		this.wheels = wheels;
		this.carBrend = carBrend;
		this.carModel = carModel;
		this.bodyType = bodyType;

		if (tankVolume > 30) {
			this.tankVolume = tankVolume;
		} else {
			this.tankVolume = 30;
		}

		if (fuel > 0) {
			this.fuel = fuel;
		} else {
			this.fuel = 0;
		}
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public String getCarBrend() {
		return carBrend;
	}

	public void setCarBrend(String carBrend) {
		this.carBrend = carBrend;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public double getTankVolume() {
		return tankVolume;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {

		if (fuel >= 0 && fuel <= this.tankVolume) {
			this.fuel = fuel;

		} else {
			this.fuel = 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result
				+ ((carBrend == null) ? 0 : carBrend.hashCode());
		result = prime * result
				+ ((carModel == null) ? 0 : carModel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fuel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		temp = Double.doubleToLongBits(tankVolume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(wheels);
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
		Car other = (Car) obj;
		if (bodyType == null) {
			if (other.bodyType != null)
				return false;
		} else if (!bodyType.equals(other.bodyType))
			return false;
		if (carBrend == null) {
			if (other.carBrend != null)
				return false;
		} else if (!carBrend.equals(other.carBrend))
			return false;
		if (carModel == null) {
			if (other.carModel != null)
				return false;
		} else if (!carModel.equals(other.carModel))
			return false;
		if (Double.doubleToLongBits(fuel) != Double
				.doubleToLongBits(other.fuel))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (Double.doubleToLongBits(tankVolume) != Double
				.doubleToLongBits(other.tankVolume))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [motor=" + motor + ", wheels=" + Arrays.toString(wheels)
				+ ", carBrend=" + carBrend + ", carModel=" + carModel
				+ ", bodyType=" + bodyType + ", tankVolume=" + tankVolume
				+ ", fuel=" + fuel + "]";
	}

	/*
	 * public boolean carDrive() {
	 * 
	 * if (getFuel() > 0 && getWheels() != null && getMotor() != null) {
	 * setFuel(getFuel() - 1); return true; } else { return false; } }
	 * 
	 * public boolean carRefuel(double fuel) {
	 * 
	 * if (fuel > 0) {
	 * 
	 * if ((fuel + this.getFuel()) <= this.getTankVolume()) {
	 * this.setFuel(this.getFuel() + fuel); return true;
	 * 
	 * } else { this.setFuel(this.getTankVolume()); return true; }
	 * 
	 * } else { return false; } }
	 * 
	 * public boolean wheelChange(Wheel wheel, int wheelSeat) {
	 * 
	 * if (wheel != null && wheels.length >= wheelSeat && wheelSeat < 0) {
	 * 
	 * wheelSeat--; wheels[wheelSeat] = wheel;
	 * 
	 * return true;
	 * 
	 * } else { return false; } }
	 */
}
