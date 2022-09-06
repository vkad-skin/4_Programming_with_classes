package by.epam.programming_with_classes.simple_objects.task4.train;

import java.util.Scanner;

/*
 * Задание 4: Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
 * назначения должны быть упорядочены по времени отправления. 
 */

public class TrainInput {

	public int inputTrainNumber() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int numberTrain;

		do {
			System.out.print("Введите номер поезда (больше нуля!) >>");

			while (!scan.hasNextInt()) {
				System.out.print("Введите число!\nВведите номер поезда >>");
				scan.nextLine();
			}

			numberTrain = scan.nextInt();

		} while (numberTrain < 1);

		System.out.println();

		return numberTrain;
	}
}