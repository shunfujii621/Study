package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	private String country = null;
	private String taste = null;
	private String foodType = null;

	public Process() {
		this.country = "日本";
		this.taste = "うまい";
		this.foodType = "寿司";
	}

	public void printGreeting() {
		if (!(this.country == null)) {
			System.out.println("こんにちは！ここは" + this.country + "です！");
		}
	}

	public void printSushi() {
		if (!(this.taste == null)) {
			System.out.println("この寿司は" + this.taste);
		}
	}

	public void printFoodType() {
		if (!(this.foodType == null)) {
			System.out.println(this.foodType + "は和食です");
		}
	}

	public void printCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		if (!(formatter == null)) {
			System.out.println("今の現在日時は" + now.format(formatter) + "です");
		}
	}

}