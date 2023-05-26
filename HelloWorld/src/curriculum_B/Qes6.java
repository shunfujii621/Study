package curriculum_B;

// RandomクラスとScannerクラスをインポート
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成し、System.inを引数に渡して初期化
		Scanner scanner = new Scanner(System.in);

		//Randomクラスのインスタンスを生成
		Random rand = new Random();

		/*
		 * String型の配列productsを定義し、要素として以下商品名を格納
		 * 要素[パソコン,冷蔵庫,扇風機,洗濯機,加湿器,テレビ,ディスプレイ]
		 */
		String[] products = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ" };

		// int型の配列countsを定義し、商品の残り台数を格納
		int[] counts = new int[products.length];
		// counts配列に0〜11のランダムな値を代入
		for (int i = 0; i < counts.length; i++) {
			counts[i] = rand.nextInt(12);
		}

		// ScannerクラスのnextLine()メソッドでユーザーからの入力を受け付け、その値をinput変数に代入
		String input = scanner.nextLine();

		// String型の配列inputProductsを宣言し、input変数の中身を「、」で区切って格納
		String[] inputProducts = input.split("、");

		/*
		 * 拡張for文を使い、inputProductsの各要素に対して以下の処理を実行
		 * ・商品名がproductsに含まれているかを調べる
		 * ・含まれている場合、その商品名のインデックスをindexに代入
		 */
		for (String product : inputProducts) {
			int index = -1;
			for (int i = 0; i < products.length; i++) {
				if (product.equals(products[i])) {
					index = i;
					break;
				}
			}

			/*
			 *  switch文を使い、indexの値に応じて以下の処理を実行
			 * ・indexの値が0～6の場合、商品名とその在庫数を出力
			 * ・default：該当する商品がない場合、「指定の商品ではありません」と出力
			 */
			switch (index) {
			case 0, 1, 2, 3, 4, 5, 6:
				System.out.println(product + "の残り台数は" + counts[index] + "台です");
				break;
			default:
				System.out.println("『" + product + "』は指定の商品ではありません");
				break;
			}
		}
	}
}
