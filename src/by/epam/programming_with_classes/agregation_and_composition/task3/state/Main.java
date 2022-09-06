package by.epam.programming_with_classes.agregation_and_composition.task3.state;

/*
 * Задание 3: Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		StateViewInfo show = new StateViewInfo();
		
		City city1 = new City("Витебск", 100_000, true, true, false);
		City city2 = new City("Лепель", 20_000, true, false, false);
		City city3 = new City("Чашники", 12_000, true, false, false);
		City city4 = new City("Новолукомль", 15_000, false, false, false);

		City city5 = new City("Минск", 500_000, true, true, true);

		District district1 = new District("Чашнинский район", 150, new City[] {
				city3, city4 });
		District district2 = new District("Лепельский район", 200,
				new City[] { city2 });
		District district3 = new District("Витебский район", 250,
				new City[] { city1 });

		District district4 = new District("Минский район", 1000,
				new City[] { city5 });

		Region region1 = new Region("Витебская область", new District[] {
				district1, district2, district3 });
		Region region2 = new Region("Минская область",
				new District[] { district4 });

		State state = new State("Беларусь", "Республика", new Region[] {
				region1, region2 });
		
		show.viewNumberOfRegionInState(state);
		show.viewRegionCenter(state);
		show.viewStateCenter(state);
		show.viewStateSquare(state);
	}
}