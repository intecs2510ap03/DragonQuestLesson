
public class SideQuestMain {

	public static void main(String[] args) {
		Attacker[] party = new Attacker[2];
		party[0] = new Slime("スライム", 10);
		party[1] = new Weapon("ロトの剣", 100);
		
		Luminous[] p1 = new Luminous[2];
		p1[0] = new Slime("スライム", 10);
		p1[1] = new Weapon("ロトの剣");
		
		
//		スライムは光るべきか？: 実装したことで「光るスライム」になりましたが、
//		もし「武器だけ光らせたい」なら、Slime クラスからは implements Luminous を外すだけで、
//		p1[0] への代入時にコンパイルエラー（「光れないよ！」という警告）が出て、設計ミスを防いでくれます。
//
//		同じ配列で管理する: もし Luminous を持っているかどうかを確認しながらループさせたい場合は、
//		instanceof という判定魔法を使うこともありますが、それはまた後ほど！
		
		for (Attacker attacker : party) {
//			if (attacker instanceof HolyAttacker) {
//				attacker.Attack();
//			}
			attacker.Attack();
			if (attacker instanceof HolyAttacker) {
		        // 聖なる力を持っている時だけ、キャストして奥義を出す
		        ((HolyAttacker) attacker).HolyAttacker();
		    }
		}
		
		System.out.println("-----------------------");
		
		for (Luminous p : p1) {
//			if (p instanceof HolyAttacker) {
//				p.shine();
//			}
			p.shine();
			if (p instanceof HolyAttacker) {
		        // 聖なる力を持っている時だけ、キャストして奥義を出す
		        ((HolyAttacker) p).HolyAttacker();
		    }
		}
		
		System.out.println("-----------------------");
		
		//((変換したい型名) 変数名).呼び出したいメソッド();
		((HolyAttacker) party[1]).HolyAttacker();

	}

}
