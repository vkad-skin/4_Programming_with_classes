package by.epam.programming_with_classes.simple_objects.task7.triangle;

/*
 * Задание 7: Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
 * площади, периметра и точки пересечения медиан.  
 */

public class TriangleLogic {

	public double areaOfTriangle(Triangle triangle) {

		double area;
		double semiPerimeter;

		semiPerimeter = (double) perimeterOfTriangle(triangle) / 2;

		area = Math.sqrt(semiPerimeter
				* (semiPerimeter - (double) triangle.getSideA())
				* (semiPerimeter - (double) triangle.getSideB())
				* (semiPerimeter - (double) triangle.getSideC()));

		return area;
	}

	public int perimeterOfTriangle(Triangle triangle) {
		return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
	}

	public void medianIntersectionPoints(Triangle triangle) {

		double medianA;
		double medianB;
		double medianC;

		medianA = Math.sqrt(2
				* (Math.pow(triangle.getSideB(), 2) + (Math.pow(
						triangle.getSideC(), 2)))
				- Math.pow(triangle.getSideA(), 2)) / 2;

		medianB = Math.sqrt(2
				* (Math.pow(triangle.getSideA(), 2) + (Math.pow(
						triangle.getSideC(), 2)))
				- Math.pow(triangle.getSideB(), 2)) / 2;

		medianC = Math.sqrt(2
				* (Math.pow(triangle.getSideB(), 2) + (Math.pow(
						triangle.getSideA(), 2)))
				- Math.pow(triangle.getSideC(), 2)) / 2;

		System.out.println("Медиана A : " + medianA + "\nМедиана B : "
				+ medianB + "\nМедиана C : " + medianC);
	}

	public double medianIntersectionA(Triangle triangle) {

		double medianA;

		medianA = Math.sqrt(2
				* (Math.pow(triangle.getSideB(), 2) + (Math.pow(
						triangle.getSideC(), 2)))
				- Math.pow(triangle.getSideA(), 2)) / 2;

		return medianA;
	}

	public double medianIntersectionB(Triangle triangle) {

		double medianB;

		medianB = Math.sqrt(2
				* (Math.pow(triangle.getSideA(), 2) + (Math.pow(
						triangle.getSideC(), 2)))
				- Math.pow(triangle.getSideB(), 2)) / 2;

		return medianB;
	}

	public double medianIntersectionC(Triangle triangle) {

		double medianC;

		medianC = Math.sqrt(2
				* (Math.pow(triangle.getSideB(), 2) + (Math.pow(
						triangle.getSideA(), 2)))
				- Math.pow(triangle.getSideC(), 2)) / 2;

		return medianC;
	}
}