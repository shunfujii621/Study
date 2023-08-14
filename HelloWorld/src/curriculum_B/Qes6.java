package curriculum_B;

// RandomクラスとScannerクラスをインポート
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、System.inを引数に渡して初期化
				Scanner scanner = new Scanner(System.in);

				// ScannerクラスのnextLine()メソッドでユーザーからの入力を受け付け、その値をinput変数に代入
				String input = scanner.nextLine();

				// String型の配列inputProductsを宣言し、input変数の中身を「、」で区切って格納
				String[] inputProducts = input.split("、");

				/*
				 * String型の配列productsを定義し、要素として以下商品名を格納
				 * 要素[パソコン,冷蔵庫,扇風機,洗濯機,加湿器,テレビ,ディスプレイ]
				 */
				Random rand = new Random();

				int tv = rand.nextInt(11) + 1;

				for (String product : inputProducts) {

					switch (product) {

					case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":
						System.out.println(product + "の残り台数は" + (rand.nextInt(11) + 1) + "台です" + "\r\n");
						break;
					case "テレビ", "ディスプレイ":
						System.out.println(product + "の残り台数は" + (product.equals("テレビ") ? tv : 11 - tv) + "台です" + "\r\n");
						break;
					default:
						System.out.println(product + "は指定の商品ではありません" + "\r\n");
					}
				}
				scanner.close();
	}
}
