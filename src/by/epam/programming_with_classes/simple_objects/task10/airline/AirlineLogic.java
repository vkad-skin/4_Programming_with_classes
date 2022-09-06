package by.epam.programming_with_classes.simple_objects.task10.airline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class AirlineLogic {

	public Airline[] createdAirlineArray() {

		Airline[] airlines = new Airline[5];

		airlines[0] = new Airline("Minsk", 120, "Boing 747", "08:34", "Пн");
		airlines[1] = new Airline("Moskow", 123, "Il 25", "12:34", "Вт");
		airlines[2] = new Airline("Kiev", 13, "Boing 747", "12:34", "Ср");
		airlines[3] = new Airline("Stambul", 84, "Il 25", "10:02", "Чт");
		airlines[4] = new Airline("Rome", 123, "Boing 747", "20:00", "Ср");

		return airlines;
	}

	public void destinationSearch(Airline[] airlines, String destination) {

		for (int indexAirline = 0; indexAirline < airlines.length; indexAirline++) {

			if (airlines[indexAirline].getDestination().compareToIgnoreCase(
					destination) == 0) {
				AirlineShow.showAirline(airlines[indexAirline]);
			}
		}
	}

	public void dayOfWeekSearch(Airline[] airlines, String dayOfWeekSearch) {

		Date dayOfWeek = null;

		try {
			dayOfWeek = new SimpleDateFormat("E").parse(dayOfWeekSearch);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int indexAirline = 0; indexAirline < airlines.length; indexAirline++) {

			if (airlines[indexAirline].getDayOfWeek().compareTo(dayOfWeek) == 0)
				AirlineShow.showAirline(airlines[indexAirline]);

		}
	}

	public void dayOfWeekAndDepartureTimeSearch(Airline[] airlines,
			String dayOfWeekSearch, String departureTimeSearch) {

		Date dayOfWeek = null;
		Date departureTime = null;

		try {
			dayOfWeek = new SimpleDateFormat("E").parse(dayOfWeekSearch);
			departureTime = new SimpleDateFormat("HH:mm")
					.parse(departureTimeSearch);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int indexAirline = 0; indexAirline < airlines.length; indexAirline++) {

			if ((airlines[indexAirline].getDayOfWeek().compareTo(dayOfWeek) == 0)
					&& (airlines[indexAirline].getDepartureTime().compareTo(
							departureTime) == 1)) {

				AirlineShow.showAirline(airlines[indexAirline]);
			}
		}
	}
}
