package by.epam.programming_with_classes.agregation_and_composition.task2.car;

/*
 * Задание 2: Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFunction function = new CarFunction();

		Motor motor = new Motor("Бензиновый", 123, 2.0);
		Wheel wheel1 = new Wheel("Литой диск", 15, "Летняя", 165);
		Wheel wheel2 = new Wheel("Штампованный диск", 15, "Летняя", 165);

		Car car = new Car(motor, new Wheel[] { wheel1, wheel1, wheel1, wheel1 },
				"Mazda", "Primacy", "Универсал", 10, 60);

		CarView.showCar(car);

		System.out.println(function.carDrive(car));
		System.out.println(function.carRefuel(car, 15));
		System.out.println(function.wheelChange(car, wheel2, 1));

		System.out.println();

		CarView.showCar(car);
		CarView.showCarBrend(car);
	}
}