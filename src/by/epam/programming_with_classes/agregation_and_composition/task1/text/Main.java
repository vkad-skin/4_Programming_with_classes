package by.epam.programming_with_classes.agregation_and_composition.task1.text;

/*
 * Задание 1: Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 * консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Word word1 = new Word("Hello");
		Word word2 = new Word("world!");
		Word word3 = new Word("Title");
		Word word4 = new Word("text");
		Word word5 = new Word("Мир");
		Word word6 = new Word("Труд!");

		Word[] words = new Word[] { new Word("Hello"), new Word("spaces!") };

		Sentence sentence1 = new Sentence(new Word[] { word1, word2 });
		Sentence sentence2 = new Sentence(words);
		Sentence sentence3 = new Sentence(new Word[] { word3, word4 });
		Sentence sentence4 = new Sentence(new Word[] { word5, word6 });

		Text text = new Text(sentence3, new Sentence[] { sentence1, sentence2 });

		text.viewText();

		System.out.println();

		text.addSentence(sentence4);
		text.viewText();
	}
}