package by.epam.programming_with_classes.simple_objects.task3.student;

/*
 * Задание 3: С Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

import java.util.Arrays;

public class Student {
	
	private static final int numberOfRatings = 5;

	private String lastName;
	private int numberGroup;
	private int[] progress = new int[numberOfRatings];

	
	public Student() {
		this.lastName = null;
		this.numberGroup = 0;
		this.progress = null;
	}
	
	public Student(String lastName, int numberGroup, int[] progress) {
		this.lastName = lastName;
		this.numberGroup = numberGroup;
		this.progress = progress;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + numberGroup;
		result = prime * result + Arrays.hashCode(progress);
		
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
		
		Student other = (Student) obj;
		
		if (lastName == null) {
			
			if (other.lastName != null)
				return false;
			
		} else if (!lastName.equals(other.lastName))
			return false;
		
		if (numberGroup != other.numberGroup)
			return false;
		
		if (!Arrays.equals(progress, other.progress))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", numberGroup=" + numberGroup
				+ ", progress=" + Arrays.toString(progress) + "]";
	}
}
