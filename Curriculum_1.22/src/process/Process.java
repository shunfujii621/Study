package process;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

// 現在日時の取得用に、LocalDateTimeクラスをインポート
import java.time.LocalDateTime;
// 表示形式の指定用に、DateTimeFormatterクラスをインポート
import java.time.format.DateTimeFormatter;

public class Process {
	// private修飾子を持つフィールド変数の宣言
	private String country;
	private String taste;
	private String foodType;

	// コンストラクタ
	public Process() {
		// 初期化
		this.country = "日本";
		this.taste = "うまい";
		this.foodType = "寿司";
	}

	public void greeting() {
		// 出力
		System.out.println("こんにちは！ここは" + this.country + "です！");
	}

	public void sushi() {
		// 出力
		System.out.println("この寿司は" + this.taste);
	}

	public void foodType() {
		// 出力
		System.out.println(this.foodType + "は和食です");
	}

	public void currentDateTime() {
		// 現在日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// 出力
		System.out.println("今の現在日時は" + now.format(formatter) + "です");
	}
}