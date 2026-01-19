import java.util.ArrayList;
import java.util.Comparator;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Slime> monsterList = new ArrayList<>();
		monsterList.add(new Slime("スライムA", 10));
		monsterList.add(new Slime("スライムB", 25));
		monsterList.add(new KingSlime("キング", 50));
		monsterList.add(new Slime("スライムC", 5));
		
		System.out.println("--- HP 20以上の仲間たち ---");
		monsterList.stream()
			.filter(s -> s.getHp() >= 20)
			.map(s -> s.getName())
			.forEach(name -> System.out.println(name));
		
		System.out.println("--- HPが低い順に並べ替え ---");
		monsterList.stream()
			.sorted(Comparator.comparing(Slime::getHp))
			.forEach(s -> System.out.println(s.getName() + " HP" + s.getHp()));
		
		System.out.println("--- HPが高い順に並べ替え ---");
		monsterList.stream()
		    .sorted(Comparator.comparingInt(Slime::getHp).reversed()) // reversed()で逆転！
		    .forEach(s -> System.out.println(s.getName() + " (HP:" + s.getHp() + ")"));
		
		System.out.println("--- 名前順に並べ替え ---");
		monsterList.stream()
		    .sorted(Comparator.comparing(Slime::getName)) // 文字列（Name）で比較
		    .forEach(s -> System.out.println(s.getName()));
	}

}
