package by.epam.programming_with_classes.simple_objects.task7.triangle;

/*
 * Задание 7: Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
 * площади, периметра и точки пересечения медиан.  
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangle = new Triangle(10, 12, 15);
		TriangleLogic logic = new TriangleLogic();

		System.out.println("Периметр: " + logic.perimeterOfTriangle(triangle));
		System.out.println("Площадь: " + logic.areaOfTriangle(triangle));

		logic.medianIntersectionPoints(triangle);
	}
}