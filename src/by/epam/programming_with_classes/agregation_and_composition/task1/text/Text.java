package by.epam.programming_with_classes.agregation_and_composition.task1.text;

import java.util.Arrays;

/*
 * Задание 1: Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 * консоль текст, заголовок текста.
 */

public class Text {

	private Sentence textTitle;
	private Sentence[] text;

	public Text() {
		textTitle = null;
		text = null;
	}

	public Text(Sentence textTitle) {
		this.textTitle = textTitle;
	}

	public Text(Sentence textTitle, Sentence[] text) {
		this.textTitle = textTitle;
		this.text = text;
	}

	public Sentence getTextTitle() {
		return textTitle;
	}

	public void setTextTitle(Sentence textTitle) {
		this.textTitle = textTitle;
	}

	public Sentence[] getText() {
		return text;
	}

	public void setText(Sentence[] text) {
		this.text = text;
	}

	public void viewText() {

		for (Sentence sentence : text) {
			sentence.viewSentence();
		}
	}

	public void viewTitleText() {

		getTextTitle().viewSentence();

	}

	public void addSentence(Sentence sentence) {

		Sentence[] text = new Sentence[this.text.length + 1];

		for (int sentenceIndex = 0; sentenceIndex < text.length; sentenceIndex++) {

			if (sentenceIndex != text.length - 1) {
				text[sentenceIndex] = this.text[sentenceIndex];

			} else {
				text[sentenceIndex] = sentence;
			}
		}
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(text);
		result = prime * result
				+ ((textTitle == null) ? 0 : textTitle.hashCode());
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
		Text other = (Text) obj;
		if (!Arrays.equals(text, other.text))
			return false;
		if (textTitle == null) {
			if (other.textTitle != null)
				return false;
		} else if (!textTitle.equals(other.textTitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [textTitle=" + getTextTitle() + ", text="
				+ Arrays.toString(getText()) + "]";
	}
}