package by.epam.programming_with_classes.agregation_and_composition.task2.car;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class CarView {

	public static void showCar(Car car) {

		String infoCar;

		if (car != null) {

			infoCar = "Машина >> " + car.getCarBrend() + " " + car.getCarModel() + "\n";
			infoCar += "Характеристика :\n" + motorToString(car.getMotor()) + "\n";
			infoCar += "Колеса >> \n" + wheelsToString(car.getWheels());
			infoCar += "Объем бака >> " + car.getTankVolume() + "\n";
			infoCar += "Количество топлива в баке >> " + car.getFuel() + "\n";
			
		} else {
			infoCar = "Машины нет!";
		}
		System.out.println(infoCar);
	}

	public static void showCarBrend(Car car) {

		if (car != null) {
			System.out.println("Марка автомобиля >> " + car.getCarBrend()
					+ "\nМодель >> " + car.getCarModel());
		} else {
			System.out.println("Машины нет!");
		}
	}

	private static String wheelsToString(Wheel[] wheels) {

		String info = "";

		if (wheels != null) {

			for (int wheelIndex = 0; wheelIndex < wheels.length; wheelIndex++) {

				info += "Колесо " + (wheelIndex + 1) + " - diskType = "
						+ wheels[wheelIndex].getDiskType()
						+ ", diskDiameter = "
						+ wheels[wheelIndex].getDiskDiameter()
						+ ", tireType = " + wheels[wheelIndex].getTireType()
						+ ", tireSize = " + wheels[wheelIndex].getTireSize()
						+ "\n";
			}

		} else {
			info = "Колес нет!";
		}
		return info;
	}
	
	private static String motorToString(Motor motor) {

		if (motor != null) {

			return "Мотор >> motorType = " + motor.getMotorType()
					+ ", motorPower = " + motor.getMotorPower()
					+ ", motorVolume = " + motor.getMotorPower();

		} else {
			return "Мотора нет!";
		}
	}
}
