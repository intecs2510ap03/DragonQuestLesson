
public class Day8Main {

	public static void main(String[] args) {
		Weapon weapon = new Weapon("ロトの剣", 100);
		
		Weapon w2 = new Weapon("修行中の剣");

		// パターン3が呼ばれる
		Weapon w3 = new Weapon();
		
		System.out.println(weapon);
		System.out.println(w2);
		System.out.println(w3);

	}

}
