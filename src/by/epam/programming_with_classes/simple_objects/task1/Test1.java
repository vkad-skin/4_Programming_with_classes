package by.epam.programming_with_classes.simple_objects.task1;

/*
 * Задание 1: Создайте  класс  Test1  двумя  переменными. 
 * Добавьте  метод  вывода  на  экран  и  методы  изменения  этих переменных. 
 * Добавьте метод, который находит сумму  значений этих  переменных, и  метод, 
 * который находит наибольшее значение из этих двух переменных.
 */

public class Test1 {
	
	public int x;
	public int y;
	
	public void outputValue() {
		System.out.println("x = " + x + "\ny = " + y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int sum() {
		return x + y;
	}

	public int maxValue() {
		return x > y ? x : y;
	}
}
