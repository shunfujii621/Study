package basicClass;

// 現在日時を取得するためにLocalDateTimeクラスをインポート
import java.time.LocalDateTime;
// 表示形式を指定するためにDateTimeFormatterクラスをインポート
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		System.out.println(dog1.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);
		System.out.println(dog2.numberOfAnimals);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在日時を取得
		LocalDateTime nowDateTime = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 文字列型の変数に「yyyy-MM-dd H:m:s」形式の現在時刻を代入
		String dateTime = format.format(nowDateTime);
		// 出力
		System.out.println(dateTime);
	}
}