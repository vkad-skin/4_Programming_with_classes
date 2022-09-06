package by.epam.programming_with_classes.simple_objects.task3.student;

/*
 * Задание 3: С Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

import java.util.Arrays;

public class StudentShow {

	private StudentLogic logic = new StudentLogic();

	public void showExcellentStudent(Student[] students) {

		if (students != null) {

			for (int indexStudent = 0; indexStudent < students.length; indexStudent++) {

				if (this.logic.excellentStudent(students[indexStudent])) {

					System.out.println("Отличник >> ФИО: "
							+ students[indexStudent].getLastName()
							+ ", номер группы: "
							+ students[indexStudent].getNumberGroup()
							+ ", оценки >> "
							+ Arrays.toString(students[indexStudent]
									.getProgress()));
				}
			}
		} else {
			showError();
		}
	}

	public void showStudentArray(Student[] students) {

		if (students != null) {

			for (Student student : students) {
				System.out
						.println("ФИО: " + student.getLastName()
								+ ", номер группы: " + student.getNumberGroup()
								+ ", оценки: "
								+ Arrays.toString(student.getProgress()));
			}
		} else {
			showError();
		}
	}

	public void showStudent(Student student) {
	
		if (student != null) {
			System.out.println("ФИО: " + student.getLastName()
					+ ", номер группы: " + student.getNumberGroup()
					+ ", оценки: " + Arrays.toString(student.getProgress()));
			
		} else {
			showError();
		}
	}

	public void showError() {
		System.out.println("Error!");
	}
}
