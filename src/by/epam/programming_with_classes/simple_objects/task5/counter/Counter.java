package by.epam.programming_with_classes.simple_objects.task5.counter;

/*
 * Задание 5: Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
 * на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
 * произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
 */

public class Counter {

	private int max;
	private int min;
	private int value;

	public Counter() {
		super();
		this.max = 9;
		this.min = 0;
		this.value = 0;
	}

	public Counter(int max, int min, int value) {
		super();

		if (min > max) {
			this.max = min;
			this.min = max;

		} else if (min < max) {
			this.max = max;
			this.min = min;

		} else {
			this.max = 9;
			this.min = 0;
		}

		if (max < value) {
			this.value = max;

		} else if (min > value) {
			this.value = min;

		} else if ((value == min) && (value == max)) {
			this.value = 0;

		} else {
			this.value = value;
		}
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {

		if (max > this.min) {
			this.max = max;

		} else {
			System.out.println("Min > Max!");
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {

		if (min < this.max) {
			this.min = min;

		} else {
			System.out.println("Min < Max!");
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {

		if ((value >= this.min) && (value <= this.max)) {
			this.value = value;

		} else {
			System.out.println("Min <= value <= Max!");
		}
	}

	public void increaseValue() {

		if ((this.getValue() >= this.getMin())
				&& (this.getValue() < this.getMax())) {
			
			this.setValue(this.getValue() + 1);
			System.out.println("Увелечение на 1.");

		} else {
			this.setValue(this.getMin());
			System.out
					.println("Счетчик больше max! Значение сбрасывается на min!");
		}
	}

	public void decreaseValue() {

		if ((this.getValue() > this.getMin())
				&& (this.getValue() <= this.getMax())) {

			this.setValue(this.getValue() - 1);
			System.out.println("Уменьшение на 1.");

		} else {
			this.setValue(this.getMin());
			System.out.println("Счетчик равен min! Уменьшение не возможно!");
		}
	}

	public void showValue() {
		System.out.println("Состояние счетчика >>" + getValue());
	}

	@Override
	public String toString() {
		return "Counter [max=" + max + ", min=" + min + ", value=" + value
				+ "]";
	}
}
