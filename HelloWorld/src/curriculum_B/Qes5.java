package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		//「課題5」と出力
		System.out.println("課題5");

		//改行
		System.out.println();

		//変数num1に1を代入し、変数num1が9になるまでインクリメント
		for (int num1 = 1; num1 <= 9; num1++) {
			//変数num2に2を代入し、変数num2が20になるまでインクリメント
			for (int num2 = 1; num2 <= 20; num2++) {
				//変数num2にnum1をかけた数を変数answersに代入
				int answers = num1 * num2;
				//変数num2が19になるまで、式の後ろに区切り「||」を付けて出力
				if (num2 <= 19) {
					System.out.printf("%03d * %03d = %03d || ", num2, num1, answers);
				}
				//変数num2が20になった場合、区切り「||」がない状態で式を出力
				else if (num2 == 20) {
					System.out.printf("%03d * %03d = %03d ", num2, num1, answers);
				}
			}
			//変数num2が20になるたびに改行
			System.out.println();
		}
	}
}