package by.epam.programming_with_classes.simple_objects.task7.triangle;

/*
 * Задание 7: Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
 * площади, периметра и точки пересечения медиан.  
 */

public class Triangle {

	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle() {
		super();
		this.sideA = 3;
		this.sideB = 4;
		this.sideC = 5;
	}

	public Triangle(int sideA) {
		super();
		this.sideA = sideA;
		this.sideB = sideA;
		this.sideC = sideA;
	}

	public Triangle(int sideA, int sideB, int sideC) {
		super();

		if ((sideA + sideB > sideC) && (sideA + sideC > sideB)
				&& (sideC + sideB > sideA)) {

			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;

		} else {
			System.out
					.println("Треугольник не существует! Выставлены стандартные значения.");
			this.sideA = 3;
			this.sideB = 4;
			this.sideC = 5;
		}
	}

	public int getSideA() {
		return sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public int getSideC() {
		return sideC;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + getSideA() + ", sideB=" + getSideB()
				+ ", sideC=" + getSideC() + "]";
	}
}