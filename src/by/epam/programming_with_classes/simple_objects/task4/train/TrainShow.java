package by.epam.programming_with_classes.simple_objects.task4.train;

import java.text.SimpleDateFormat;

/*
 * Задание 4: Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */

public class TrainShow {

	public void showTrainArray(Train[] trainArray) {
	
		for (Train train : trainArray) {
			System.out.println("Пункт назначения: " + train.getDestination()
				+ " Номер поезда: " + train.getNumberTrain()
				+ " Дата и время: " + new SimpleDateFormat("dd.MM.yyyy HH:mm")
						.format(train.getDepartureTime()));
		}
		System.out.println();
	}
	
	public void showTrain(Train train) {
		
		System.out.println("Пункт назначения: " + train.getDestination()
				+ " Номер поезда: " + train.getNumberTrain()
				+ " Дата и время: " + new SimpleDateFormat("dd.MM.yyyy HH:mm")
						.format(train.getDepartureTime()));
	}
	
	public void showErrorSearchTrain() {
		System.out.println("Номер поезда не найден!\n");
	}
	
	public void showError() {
		System.out.println("Ошибка!\n");
	}
}
