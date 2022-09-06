package by.epam.programming_with_classes.simple_objects.task10.airline;

/*
 * Задание 10: Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и 
 * методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
 * Найти и вывести:
 * 		a) список рейсов для заданного пункта назначения;  
 * 		b) список рейсов для заданного дня недели; 
 * 		c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {

		AirlineLogic logic = new AirlineLogic();

		Airline[] airlines = logic.createdAirlineArray();

		AirlineShow.showAirlineArray(airlines);
		System.out.println();

		logic.destinationSearch(airlines, "kiev");
		System.out.println();

		logic.dayOfWeekSearch(airlines, "Пн");
		System.out.println();

		logic.dayOfWeekAndDepartureTimeSearch(airlines, "Ср", "12:33");
	}
}