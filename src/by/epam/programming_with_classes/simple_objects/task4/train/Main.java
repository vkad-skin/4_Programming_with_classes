package by.epam.programming_with_classes.simple_objects.task4.train;

/*
 * Задание 4: Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainLogic trainLogic = new TrainLogic();
		TrainShow infoTrain = new TrainShow();

		Train[] trainArray = trainLogic.trainCreated(5);

		trainLogic.trainNumberSort(trainArray);
		infoTrain.showTrainArray(trainArray);

		trainLogic.trainNumberSearch(trainArray);

	}
}
