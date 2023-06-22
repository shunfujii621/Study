package execution;

public class Execution {
	public static void main(String[] args) {

		// Processクラスのインスタンス
		process.Process processing = new process.Process();

		// Processクラスの各メソッドを呼び出し
		processing.greeting();
		processing.sushi();
		processing.foodType();
		processing.currentDateTime();

	}
}