package curriculum_B;

//Scannerクラスをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		//Q1.ログイン時の入力チェックシステムを作成
		//Q2.ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力

		// Scannerクラスのインスタンスを作成し、System.inを引数に渡して初期化
		Scanner scanner = new Scanner(System.in);

		//入力された内容を取得し、変数userNameに代入
		String userName = scanner.nextLine();

		//入力した文字数が10文字より多い場合 「名前を10文字以内にしてください」 と出力
		if (userName.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		}
		//入力した文字数が0文字以下またはnullの場合 「名前を入力してください」 と出力
		else if (userName.length() <= 0 || userName == null) {
			System.out.println("「名前を入力してください」");
		}
		//ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		else if (!userName.matches("[a-zA-Z0-9]+")) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		}
		//入力した文字数が正常な値だった場合 ユーザー名「 入力したユーザー名 」を登録しました 」と出力
		else {
			System.out.println("ユーザー名「 " + userName + " 」を登録しました");

			//以下Q3.じゃんけんのシステムを作成

			//勝った数として変数winCountを初期化
			int winCount = 0;

			//あいこの数として変数drowCountを初期化
			int drawCount = 0;

			//負けた数として変数loseCountを初期化
			int loseCount = 0;

			//じゃんけんに一勝するまで（winCountが0以外になるまで）繰り返し処理
			while (winCount == 0) {

				//ユーザーの手として変数userNameを宣言し、整数0-3までの乱数を取得
				int userHand = (int) (Math.random() * 3);
				//CPUの手として変数userNameを宣言し、整数0-3までの乱数を取得
				int computerHand = (int) (Math.random() * 3);

				//変数userHandStringに初期値として空文字を代入
				String userHandString = "";
				//変数computerHandStringに初期値として空文字を代入
				String computerHandString = "";

				//ユーザーがグーを出した場合、変数userHandStringに「グー」代入
				if (userHand == 0) {
					userHandString = "グー";
				}
				//ユーザーがチョキを出した場合、変数userHandStringに「チョキ」代入
				else if (userHand == 1) {
					userHandString = "チョキ";
				}
				//ユーザーがパーを出した場合、変数userHandStringに「パー」代入
				else if (userHand == 2) {
					userHandString = "パー";
				}

				//CPUがグーを出した場合、変数computerHandStringに「グー」代入
				if (computerHand == 0) {
					computerHandString = "グー";
				}
				//CPUがチョキを出した場合、変数computerHandStringに「チョキ」代入
				else if (computerHand == 1) {
					computerHandString = "チョキ";
				}
				//CPUがパーを出した場合、変数computerHandStringに「パー」代入
				else if (computerHand == 2) {
					computerHandString = "パー";
				}

				//『変数userNameの手は「変数userHandString」』と出力
				System.out.println(userName + "の手は「" + userHandString + "」");
				//『相手の手は「変数computerHandString」』と出力
				System.out.println("相手の手は「" + computerHandString + "」");

				//改行
				System.out.println("");

				/*
				 * ユーザーが勝った場合、変数winCountをインクリメントし、以下を出力
				 * やるやん。
				 * 次は俺にリベンジさせて
				 */
				if ((userHand == 0 && computerHand == 1) || (userHand == 1 && computerHand == 2)
						|| (userHand == 2 && computerHand == 0)) {
					winCount++;
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
				}
				// ユーザーが負けた場合、変数loseCountをインクリメントし、「俺の勝ち！」と出力
				else if ((userHand == 0 && computerHand == 2) || (userHand == 1 && computerHand == 0)
						|| (userHand == 2 && computerHand == 1)) {
					loseCount++;
					System.out.println("俺の勝ち！");
					/*
					 * ユーザーがグーで負けた場合、以下を出力
					 * 負けは次につながるチャンスです！
					 * ネバーギブアップ！
					 */
					if (userHand == 0) {
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！");
					}
					/*
					 * ユーザーがチョキで負けた場合、以下を出力
					 * たかがじゃんけん、そう思ってないですか？
					 * それやったら次も、俺が勝ちますよ
					 */
					else if (userHand == 1) {
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ");
					}
					/*
					 * ユーザーがパーで負けた場合、以下を出力
					 * なんで負けたか、明日まで考えといてください。
					 * そしたら何かが見えてくるはずです
					 */
					else {
						System.out.println("なんで負けたか、明日まで考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです");
					}
				}
				//あいこだった場合、変数drawCountをインクリメントし、「DRAW あいこ もう一回しましょう！」と出力
				else {
					drawCount++;
					System.out.println("DRAW あいこ もう一回しましょう！");
				}

				//改行
				System.out.println("");

			}

			//勝ち、あいこ、負けの数の合計を変数totalCountに代入
			int totalCount = winCount + drawCount + loseCount;
			//じゃんけんを行った回数（勝ち、あいこ、負けの数の合計）を『勝つまでにかかった合計回数は「変数totalCount」回です』と出力
			System.out.println("勝つまでにかかった合計回数は" + totalCount + "回です");
		}
	}
}
