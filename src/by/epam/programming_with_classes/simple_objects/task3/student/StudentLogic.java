package by.epam.programming_with_classes.simple_objects.task3.student;

/*
 * Задание 3: С Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class StudentLogic {
	
	public StudentLogic() {

	}
	
	public Student[] createdStudent() {

		Student[] students = new Student[10];

		students[0] = new Student("Dirik A.F.", 15, new int[] { 3, 5, 6, 7, 9 });
		students[1] = new Student("Onkile A.F.", 14, new int[] { 9, 9, 10, 10, 9 });
		students[2] = new Student("Dirik A.F.", 13, new int[] { 3, 5, 6, 7, 9 });
		students[3] = new Student("Dirik A.F.", 12, new int[] { 3, 5, 6, 7, 9 });
		students[4] = new Student("Dirik A.F.", 11, new int[] { 3, 5, 6, 7, 9 });
		students[5] = new Student("Onkile A.F.", 21, new int[] { 9, 9, 10, 10, 9 });
		students[6] = new Student("Dirik A.F.", 22, new int[] { 3, 5, 6, 7, 9 });
		students[7] = new Student("Dirik A.F.", 23, new int[] { 3, 5, 6, 7, 9 });
		students[8] = new Student("Dirik A.F.", 24, new int[] { 3, 5, 6, 7, 9 });
		students[9] = new Student("Dirik A.F.", 25, new int[] { 9, 9, 10, 10, 9 });

		return students;
	}
	
	public boolean excellentStudent(Student student) {
		
		boolean excellentGrade;
		
		excellentGrade = true;
		
		for (int indexProgress = 0; indexProgress < student.getProgress().length; indexProgress++) {

			if (student.getProgress()[indexProgress] < 9) {
				excellentGrade = false;
			}
		}
		
		return excellentGrade;
	}
}
