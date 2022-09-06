package by.epam.programming_with_classes.simple_objects.task6.time;

/*
 * Задание 6: Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и 
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
 * недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на 
 * заданное количество часов, минут и секунд. 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		Time time2 = new Time(20, 59, 35);
		Time time3 = new Time(3, 60, -2);

		time.hoursChange(13);
		time2.minutesChange(20);
		time3.secondChange(1000);
		time3.secondChange(-34);

		time.showTime();
		time2.showTime();
		time3.showTime();

		time2.allTimeChange(12, 45, 55);
		time2.showTime();
	}
}