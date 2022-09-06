package by.epam.programming_with_classes.simple_objects.task4.train;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Задание 4: Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */

public class Train {

	private String destination;
	private int numberTrain;
	private Date departureTime;

	public Train(String destination, int numberTrain, String time) {
		super();
		this.destination = destination;
		this.numberTrain = numberTrain;

		try {
			this.departureTime = new SimpleDateFormat("dd.MM.yyyy HH:mm")
					.parse(time);
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

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public int compareTo(Train train) {

		int result;

		result = this.getDestination().compareTo(train.getDestination());

		if (result == 0) {
			result = this.getDepartureTime()
					.compareTo(train.getDepartureTime());
		}

		return result;
	}

	@Override
	public String toString() {
		return "Train [destination="
				+ destination
				+ ", numberTrain="
				+ numberTrain
				+ ", departureTime="
				+ new SimpleDateFormat("dd.MM.yyyy HH:mm")
						.format(getDepartureTime()) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberTrain;
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
		Train other = (Train) obj;
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
		if (numberTrain != other.numberTrain)
			return false;
		return true;
	}
}
