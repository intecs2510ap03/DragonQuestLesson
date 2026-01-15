import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<Slime> monsterList = new ArrayList<>();

		Slime s1 = new Slime("スライムA",10);
		Slime s2 = new Slime("スライムB",20);
		KingSlime s3 = new KingSlime("キング",30);

		monsterList.add(s1);
		monsterList.add(s2);
		monsterList.add(s3);
		
		for (Slime slime : monsterList) {
			System.out.print(slime.getName() + ": " );
			slime.bark();
		}
		System.out.println("現在の魔物の数：" + monsterList.size() + "匹");
		System.out.println("");
		System.out.println("----------------------------");
		
		System.out.println("--- 混合パーティの出撃 ---");
		
		ArrayList<Attacker> partyList = new ArrayList<>();
		
		Weapon s4 = new Weapon("ロトの剣");
		
		partyList.add(s1);
		partyList.add(s4);
		partyList.add(s3);

		
		for (Attacker a : partyList) {
			a.Attack();
		}
		System.out.println("現在の戦力：" + partyList.size());
		System.out.println("");
		System.out.println("----------------------------");

		System.out.println("--- パーティの整理 ---");
		System.out.print("「" + s4.name + "」を検索中... ->");
		if (partyList.contains(s4)) {
			System.out.println(" 発見！");
		}
		System.out.println("現在の戦力：" + partyList.size());
		
		partyList.remove(s1);
		if (!partyList.contains(s1)) {
			System.out.println("「" + s1.name + "」がパーティから離脱しました。");
		}
		System.out.println("現在の戦力：" + partyList.size());
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("--- 魔物図鑑の参照 ---");
		
		HashMap<String, Slime> monsterMap = new HashMap<>();
		monsterMap.put("キング", s3);
		
		Slime s = monsterMap.get("キング");
		
		System.out.println(s.getName() + "を召喚します。");
		s.Attack();
		System.out.println("現在の図鑑登録数：" + monsterMap.size());
		
		if (monsterMap.containsKey("キング")) {
		    System.out.println("発見しました！");
		} else {
		    System.out.println("その魔物は図鑑に未登録です。");
		}
		

	}

}
