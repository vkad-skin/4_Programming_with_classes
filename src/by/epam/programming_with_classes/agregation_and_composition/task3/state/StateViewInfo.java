package by.epam.programming_with_classes.agregation_and_composition.task3.state;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class StateViewInfo {

	public void viewStateCenter(State state) {

		if (state != null) {
			System.out.println("Столица >> "
					+ state.getStateCenter().getCityName());
		}
	}

	public void viewNumberOfRegionInState(State state) {

		if (state != null) {
			System.out.println("Количество областей >> "
					+ state.getRegions().length);
		}
	}

	public void viewStateSquare(State state) {

		if (state != null) {
			System.out.println("Площадь >> " + state.getStateSquare());
		}
	}

	public void viewRegionCenter(State state) {

		if (state != null) {

			String info = "Областные центры >> ";

			for (Region region : state.getRegions()) {
				info += region.getRegionCenter().getCityName() + " ";
			}
			System.out.println(info);
		}
	}
}