package by.epam.programming_with_classes.agregation_and_composition.task1.text;

import java.util.Arrays;

/*
 * Задание 1: Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 * консоль текст, заголовок текста.
 */

public class Sentence {

	private Word[] sentence;

	public Sentence() {
		sentence = null;
	}

	public Sentence(Word[] words) {
		sentence = words;
	}

	public Word[] getSentence() {
		return sentence;
	}

	public void setSentence(Word[] sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(sentence);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (!Arrays.equals(sentence, other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + Arrays.toString(sentence) + "]";
	}

	public void viewSentence() {

		StringBuilder builder = new StringBuilder();

		for (int wordIndex = 0; wordIndex < sentence.length; wordIndex++) {

			if (wordIndex != sentence.length - 1) {
				builder.append(sentence[wordIndex].getWord() + " ");

			} else {
				builder.append(sentence[wordIndex].getWord());
			}
		}

		System.out.println(builder.toString());
	}
}
