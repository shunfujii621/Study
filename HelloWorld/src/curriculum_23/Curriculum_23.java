package curriculum_23;

public class Curriculum_23 {
	/*
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 */

	public static void main(String[] args) {

		Animal lion = new Animal();
		
		// 名前・体重・速度をセット
		lion.setName("ライオン");
		lion.setHeight(2.1);
		lion.setSpeed(80);
		
		// 出力
		System.out.println("動物名："+ lion.getName());
		System.out.println("体長："+lion.getHeight()+"m");
		System.out.println("速度："+lion.getSpeed()+"km/h");
		
	}
}
	// 処理用クラス
	class Animal {
		// 名前・体長・速度のフィールド変数宣言
		private String name;
		private double height;
		private int speed;

		// 
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}

		// height
		public double getHeight() {
			return this.height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		// speed
		public int getSpeed() {
			return this.speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}
