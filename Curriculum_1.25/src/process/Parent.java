package process;

// ランダムクラスのインポート
import java.util.Random;

public class Parent {

	// Randomクラスのインスタンス
	Random rand = new Random();

	// 名前と各ステータスのフィールド変数宣言
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defense;

	public Parent(String name) {
		this.name = name;
		// 乱数の代入
		this.hp = randomStatus();
		this.mp = randomStatus();
		this.attack = randomStatus();
		this.agility = randomStatus();
		this.defense = randomStatus();
	}

	// 名前の取得
	public String getName() {
		return name;
	}

	// HPの取得と代入
	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPの取得と代入
	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	// 攻撃力の取得と代入
	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 素早さの取得と代入
	public int getAgility() {
		return this.agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	// 防御力の取得と代入
	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void printStatus() {
		System.out.println("こんにちは、" + name + "さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + attack);
		System.out.println("素早さ：" + agility);
		System.out.println("防御力：" + defense);
		System.out.println("\nさあ冒険に出かけよう！");
	}

	private int randomStatus() {
		Random random = new Random();
		// 0～999の乱数を返す
		return random.nextInt(1000);
	}

}
