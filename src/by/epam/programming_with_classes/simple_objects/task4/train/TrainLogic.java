package by.epam.programming_with_classes.simple_objects.task4.train;

/*
 * Задание 4: Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */

public class TrainLogic {

	private static TrainShow infoTrain = new TrainShow();
	private TrainInput enter = new TrainInput();

	public Train[] trainCreated(int trainAmount) {

		Train[] trainArray = new Train[trainAmount];

		trainArray[0] = new Train("Vitebsk", 103, "15.05.2021 12:11");
		trainArray[1] = new Train("Brest", 143, "13.05.2022 12:36");
		trainArray[2] = new Train("Minsk", 1234, "13.05.2022 14:35");
		trainArray[3] = new Train("Chelnu", 12, "12.05.2022 12:35");
		trainArray[4] = new Train("Brest", 103, "13.05.2022 12:35");

		return trainArray;
	}

	public Train[] trainNumberSort(Train[] trainArray) {

		if (trainArray != null) {

			int indexTrainArray;

			indexTrainArray = 0;

			while (true) {

				if (trainArray[indexTrainArray].getNumberTrain() > trainArray[indexTrainArray + 1]
						.getNumberTrain()) {

					swapTrain(trainArray, indexTrainArray, indexTrainArray + 1);

					if (indexTrainArray > 0) {
						indexTrainArray--;
					}

				} else if (trainArray[indexTrainArray].getNumberTrain() <= trainArray[indexTrainArray + 1]
						.getNumberTrain()) {
					indexTrainArray++;
				}

				if (indexTrainArray == trainArray.length - 1) {
					break;
				}
			}

		} else {
			infoTrain.showError();
		}

		return trainArray;
	}

	public Train[] destinationSort(Train[] trainArray) {

		if (trainArray != null) {

			int indexTrainArray;
			indexTrainArray = 0;

			while (true) {

				if (trainArray[indexTrainArray]
						.compareTo(trainArray[indexTrainArray + 1]) > 0) {

					swapTrain(trainArray, indexTrainArray, indexTrainArray + 1);

					if (indexTrainArray > 0) {
						indexTrainArray--;
					}

				} else {
					indexTrainArray++;
				}

				if (indexTrainArray == trainArray.length - 1) {
					break;
				}
			}

		} else {
			infoTrain.showError();
		}

		return trainArray;
	}

	public void trainNumberSearch(Train[] trainArray, int numberTrain) {

		boolean trainSearch = false;

		for (Train train : trainArray) {

			if (train.getNumberTrain() == numberTrain) {
				infoTrain.showTrain(train);
				trainSearch = true;
			}
		}

		if (!trainSearch) {
			infoTrain.showErrorSearchTrain();
		}
	}

	public void trainNumberSearch(Train[] trainArray) {

		int numberTrain;
		boolean trainSearch;

		trainSearch = false;
		numberTrain = enter.inputTrainNumber();

		for (Train train : trainArray) {

			if (train.getNumberTrain() == numberTrain) {
				infoTrain.showTrain(train);
				trainSearch = true;
			}
		}

		if (!trainSearch) {
			infoTrain.showErrorSearchTrain();
		}
	}

	public Train[] swapTrain(Train[] trainArray, int indexTrainArray,
			int indexCustomerArraySwap) {

		Train trainContainer;

		trainContainer = trainArray[indexCustomerArraySwap];
		trainArray[indexCustomerArraySwap] = trainArray[indexTrainArray];
		trainArray[indexTrainArray] = trainContainer;

		return trainArray;
	}
}
