package by.epam.programming_with_classes.agregation_and_composition.task2.car;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class CarFunction {

	public boolean carDrive(Car car) {

		if (car != null) {

			if ((car.getFuel() > 0 && car.getWheels() != null)
					&& (car.getMotor() != null)) {
				car.setFuel(car.getFuel() - 1);
				return true;

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean carRefuel(Car car, double fuel) {

		if (fuel > 0 && car != null) {

			if ((fuel + car.getFuel()) <= car.getTankVolume()) {
				car.setFuel(car.getFuel() + fuel);
				return true;

			} else {
				car.setFuel(car.getTankVolume());
				return true;
			}

		} else {
			return false;
		}
	}

	public boolean wheelChange(Car car, Wheel wheel, int wheelSeat) {

		if (wheel != null && car != null) {

			if (car.getWheels().length >= wheelSeat && wheelSeat > 0) {
				wheelSeat--;
				car.getWheels()[wheelSeat] = wheel;
				return true;

			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}