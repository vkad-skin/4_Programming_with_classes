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

public class Airline {

	private String destination;
	private int fightNumber;
	private String aircraftType;
	private Date departureTime;
	private Date dayOfWeek;

	public Airline(String destination, int fightNumber, String aircraftType,
			String departureTime, String dayOfWeek) {
		super();
		this.destination = destination;
		this.fightNumber = fightNumber;
		this.aircraftType = aircraftType;

		try {
			this.departureTime = new SimpleDateFormat("HH:mm")
					.parse(departureTime);
			this.dayOfWeek = new SimpleDateFormat("E").parse(dayOfWeek);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFightNumber() {
		return fightNumber;
	}

	public void setFightNumber(int fightNumber) {
		this.fightNumber = fightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		try {
			this.departureTime = new SimpleDateFormat("HH:mm")
					.parse(departureTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		try {
			this.dayOfWeek = new SimpleDateFormat("E").parse(dayOfWeek);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String toString() {
		return "Airline >> destination = " + getDestination() 
				+ ", fightNumber = " + getFightNumber()
				+", aircraftType = " + getAircraftType()
				+ ", departureTime = " + new SimpleDateFormat("HH:mm").format(getDepartureTime())
				+ ", dayOfWeek = " + new SimpleDateFormat("E").format(getDayOfWeek());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result
				+ ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result
				+ ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + fightNumber;
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (fightNumber != other.fightNumber)
			return false;
		return true;
	}
}