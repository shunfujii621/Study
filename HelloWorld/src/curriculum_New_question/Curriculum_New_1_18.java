package curriculum_New_question;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// HelloJavaSE11メソッドを定義し、文字列型のst、整数型のnumを引数として受け取る
	public static void HelloJavaSE11(String st, int num) {

		// 引数の値を変数に代入して出力
		System.out.println(st + " " + num);

	}

	//==================================================================================================================

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// multiplyNumbersメソッドを定義し、整数型のnum1,num2を引数として受け取る
	public static void multiplyNumbers(int num1, int num2) {

		// num1とnum2をかけた値をanswerに代入
		int answer = num1 * num2;
		// answerを出力
		System.out.println(answer);

	}

	//==================================================================================================================

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// intArrayメソッドを定義し、int配列のintArrayを引数として受け取る
	public static void intArray(int[] intArray) {

		// 拡張for文で、intArray配列の各要素numbersに対して処理を実行
		for (int numbers : intArray) {
			//numbersを出力
			System.out.println(numbers);
		}

	}

	//==================================================================================================================

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q2のクラス名multiplyNumbersをオーバーロードし、変数num1,num2を倍精度浮動小数点数型に変更して引数として受け取る
	public static void multiplyNumbers(double num1, double num2) {

		// num1とnum2を足した値を倍精度浮動小数点数型のanswerに代入
		double answer = num1 + num2;
		// answerを出力
		System.out.println(answer);

	}

	//==================================================================================================================

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 整数型の配列のgenerateRandomNumbersメソッドを定義し、整数型のcountを引数として受け取る
	public static int[] generateRandomNumbers(int count) {

		// 整数型のrandomNumbers配列に、引数を代入
		int[] randomNumbers = new int[count];
		// 整数型iが引数より小さい値であるかぎり実行される繰り返し処理（引数分実行される繰り返し処理）
		for (int i = 0; i < count; i++) {
			// 1以上101未満のランダムな整数を取得し、randomNumberに代入
			// Math.random()メソッドで生成される値は倍精度浮動小数点数なので、整数型にキャスト
			int randomNumber = (int) (Math.random() * 100) + 1;
			// ramdomNumberに代入された値を、randomNumbers配列のi番目の要素として格納
			randomNumbers[i] = randomNumber;
			// randomNumbers配列のi番目の要素を出力
			System.out.println(randomNumbers[i]);
		}
		// randomNumbersの値を呼び出し元(generateRandomNumbers)に返す
		return randomNumbers;

	}

	//==================================================================================================================

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double average(int[] numbers) {
		// 整数型の変数sumを定義し、初期化
		int sum = 0;
		// 拡張for文で、numbers配列で受け取ったQ5の返り値の数分繰り返し処理
		for (int num : numbers) {
			// 変数sumにnumbers配列の要素(変数num)を和算
			sum += num;
		}
		// 倍精度浮動小数点数型にキャストした変数sumをnumbers配列の要素数で割り平均値を算出し、変数averageに代入
		double average = (double) sum / numbers.length;
		// 変数averageを出力
		System.out.println(average);
		// Q7のために変数averageを呼び出し元(average)に返す
		return average;
	}

	//==================================================================================================================

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void jedge(double average) {
		if (average >= 50) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	//==================================================================================================================

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1.
		HelloJavaSE11("Hello JavaSE ", 11);

		//=======================
		// 改行
		System.out.println();
		//=======================

		// Q2.
		multiplyNumbers(100, 85);

		//=======================
		// 改行
		System.out.println();
		//=======================

		// Q3.
		int[] intArray = { 1, 2, 3, 4, 5 };
		intArray(intArray);

		//=======================
		// 改行
		System.out.println();
		//=======================

		// Q4.
		multiplyNumbers(3.5, 32.5);

		//=======================
		// 改行
		System.out.println();
		//=======================

		// Q5.(※Q6で使用するためにrandomNumbers配列に代入)
		int[] randomNumbers = generateRandomNumbers(3);

		//=======================
		// 改行
		System.out.println();
		//=======================

		// Q6.(※Q7で使用するために変数avgに代入)
		double avg = average(randomNumbers);

		//=======================
		// 改行
		System.out.println();
		//=======================
		
		// Q6.
		jedge(avg);
	}
}
