package curriculum_B;

// Scannerクラスをインポート
import java.util.Scanner;

public class Qes7 {
	public static void main(String args[]) {

		// Scannerクラスのインスタンスを作成し、System.inを引数に渡して初期化
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数の入力欄を出力
		System.out.print("生徒の人数を入力してください（2以上）:");
		// ScannerクラスのnextInt()メソッドでユーザーからの入力を受け付け、その値をstudents変数に代入（生徒の人数）
		int numOfStudents = scanner.nextInt();

		// 点数の合計を初期化
		double totalEnglish = 0.0;
		double totalMath = 0.0;
		double totalScience = 0.0;
		double totalSocial = 0.0;

		// 生徒の人数と変数iの値が一致するまで、以下出力された内容に対して点数を入力
		for (int i = 1; i <= numOfStudents; i++) {
			System.out.print(i + "人目の『英語』の点数を入力してください :");
			double englishScore = scanner.nextDouble();
			totalEnglish += englishScore;

			System.out.print(i + "人目の『数学』の点数を入力してください :");
			double mathScore = scanner.nextDouble();
			totalMath += mathScore;

			System.out.print(i + "人目の『理科』の点数を入力してください :");
			double scienceScore = scanner.nextDouble();
			totalScience += scienceScore;

			System.out.print(i + "人目の『社会』の点数を入力してください :");
			double socialScore = scanner.nextDouble();
			totalSocial += socialScore;

			// 改行
			System.out.println("");
		}

		// 英語の平均点
		double averageEnglish = totalEnglish / numOfStudents;
		// 数学の平均点
		double averageMath = totalMath / numOfStudents;
		// 理科の平均点
		double averageScience = totalScience / numOfStudents;
		// 社会の平均点
		double averageSocial = totalSocial / numOfStudents;
		// 全体の平均点
		double overallAverage = (averageEnglish + averageMath + averageScience + averageSocial) / 4;

		// 各生徒の平均点を出力
		for (int i = 1; i <= numOfStudents; i++) {
			System.out.printf("%d人目の平均点は%.2f点です。\n", i, overallAverage);
		}

		// 各教科の平均点と全体の平均点を出力
		System.out.printf("\n英語の平均点は%.2f点です。\n", averageEnglish);
		System.out.printf("数学の平均点は%.2f点です。\n", averageMath);
		System.out.printf("理科の平均点は%.2f点です。\n", averageScience);
		System.out.printf("社会の平均点は%.2f点です。\n", averageSocial);
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

		scanner.close();

	}
}