package main;

// Scannerクラスのインポート
import java.util.Scanner;

// processパッケージのChildクラスのインポート
import process.Child;

public class Execution {

	public static void main(String[] args) {
		
		// 名前の入力欄設定
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        scanner.close();

        // インスタンス生成
        Child player = new Child(playerName);
        // 呼び出し
        player.printStatus();
    }
}
