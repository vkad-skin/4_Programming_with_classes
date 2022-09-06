package by.epam.programming_with_classes.simple_objects.task2;

/*
 * Задание 2: Создйте  класс  Test2  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте 
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
 * класса. 
 */

public class Test2 {
	
	public int x;
	public int y;
	
	public Test2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Test2() {
		x = 0;
		y = 0;
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
}
