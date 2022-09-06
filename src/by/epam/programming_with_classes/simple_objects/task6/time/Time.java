package by.epam.programming_with_classes.simple_objects.task6.time;

/*
 * Задание 6: Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и 
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
 * недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на 
 * заданное количество часов, минут и секунд. 
 */

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		super();
		this.hours = 0;
		this.minutes = 0;
		this.minutes = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;

		if ((minutes <= 59) && (minutes >= 0)) {
			this.minutes = minutes;

		} else {
			this.minutes = 0;
		}

		if ((seconds <= 59) && (seconds >= 0)) {
			this.seconds = seconds;

		} else {
			this.seconds = 0;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {

		if ((minutes <= 59) && (minutes >= 0)) {
			this.minutes = minutes;

		} else {
			this.minutes = 0;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {

		if ((seconds <= 59) && (seconds >= 0)) {
			this.seconds = seconds;

		} else {
			this.seconds = 0;
		}
	}

	public void hoursChange(int hours) {

		if (hours > 0) {
			this.setHours(hours + this.getHours());

		} else {
			System.out
					.println("Время без изменений (введено отрицательное или нулевое значение часов)!");
		}
	}

	public void minutesChange(int minutes) {

		if (minutes > 0) {

			minutes += this.getMinutes();

			if (minutes > 59) {
				this.hoursChange(minutes / 60);
				minutes %= 60;
			}

			if (minutes <= 59) {
				this.setMinutes(minutes);
			}

		} else {
			System.out
					.println("Время без изменений (введено отрицательное или нулевое значение минут)!");
		}
	}

	public void secondChange(int second) {

		if (second > 0) {

			second += this.getSeconds();

			if (second > 59) {
				this.minutesChange(second / 60);
				second %= 60;
			}

			if (second <= 59) {
				this.setSeconds(second);
			}

		} else {
			System.out
					.println("Время без изменений (введено отрицательное или нулевое значение секунд)!");
		}
	}

	public void allTimeChange(int hour, int minute, int second) {

		this.secondChange(second);
		this.minutesChange(minute);
		this.hoursChange(hour);
	}

	@Override
	public String toString() {
		return "Time >> " + hours + ":" + minutes + ":" + seconds;
	}

	public void showTime() {
		System.out.println(toString());
	}
}
