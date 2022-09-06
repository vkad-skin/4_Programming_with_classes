package by.epam.programming_with_classes.simple_objects.task3.student;

/*
 * Задание 3: С Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentLogic logic = new StudentLogic();
		StudentShow infoStudent = new StudentShow();
		
		Student [] students = logic.createdStudent();
		
		infoStudent.showStudentArray(students);
		System.out.println();
		
		infoStudent.showExcellentStudent(students);
	}
}
