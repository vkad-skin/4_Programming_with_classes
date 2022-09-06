package by.epam.programming_with_classes.simple_objects.task5.counter;

/*
 * Задание 5: Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
 * на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
 * произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter counter = new Counter();
		Counter counter2 = new Counter(100, 0, 10);

		counter.increaseValue();
		counter2.decreaseValue();

		counter.showValue();
		counter2.showValue();
	}

}
