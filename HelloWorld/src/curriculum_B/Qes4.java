package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {

		// 「課題4」と出力
		System.out.println("課題4");

		// 改行
		System.out.println();

		// 変数num1に1を代入し、変数num1が9になるまでインクリメント
		for (int num1 = 1; num1 <= 9; num1++) {
			// 変数num2に2を代入し、変数num2が9になるまでインクリメント
			for (int num2 = 1; num2 <= 9; num2++) {
				// 変数num1にnum2をかけた数を変数answersに代入
				int answers = num1 * num2;
				// 変数num2が8になるまで、式の後ろに区切り「||」を付けて出力
				if (num2 <= 8) {
					System.out.printf("%02d * %02d = %02d || ", num1, num2, answers);
				}
				// 変数num2が9になった場合、区切り「||」がない状態で式を出力
				else if (num2 == 9) {
					System.out.printf("%02d * %02d = %02d ", num1, num2, answers);
				}
			}
			// 変数num2が9になるたびに改行
			System.out.println();
		}
	}

}
