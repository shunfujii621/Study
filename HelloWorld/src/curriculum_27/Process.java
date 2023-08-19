package curriculum_27;

public class Process {

	public static void processAnimalInfo(String input) {

		// 「,」で動物名・体長・速度を一つのまとまりとして区切る
		String[] animals = input.split(",");

		// 動物名・体長・速度・学名を区切って変数に代入し、出力
		for (String animalInfo : animals) {
			String[] infoParts = animalInfo.split(":");
			String name = infoParts[0];
			String length = infoParts[1];
			String speed = infoParts[2];
			String scientificName = getScientificName(name);

			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName + "\n");
		}
	}

	private static String getScientificName(String animalName) {

		// 入力された動物名の文字列によって出力される学名を設定
		switch (animalName) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return "不明";
		}
	}
}
