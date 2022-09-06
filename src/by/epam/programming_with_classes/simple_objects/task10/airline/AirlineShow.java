package by.epam.programming_with_classes.simple_objects.task10.airline;

import java.text.SimpleDateFormat;

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

public class AirlineShow {

	public static void showAirline(Airline airline) {

		System.out.println("Airline >> destination = " + airline.getDestination() 
				+ ", fightNumber = " + airline.getFightNumber()
				+", aircraftType = " + airline.getAircraftType()
				+ ", departureTime = " 
				+ new SimpleDateFormat("HH:mm").format(airline.getDepartureTime())
				+ ", dayOfWeek = " 
				+ new SimpleDateFormat("E").format(airline.getDayOfWeek()));
	}
	
	public static void showAirlineArray(Airline[] airlines) {

		for (Airline airline : airlines) {
			showAirline(airline);
		}
	}

	public static void showError() {
		System.out.println("Error!");
	}
}
