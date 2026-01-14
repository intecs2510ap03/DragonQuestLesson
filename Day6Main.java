
public class Day6Main {

	public static void main(String[] args) {
		Slime slimes[] = new Slime[3];
		slimes[0] = new Slime("スライム0",10);
		slimes[1] = new Slime("スライム1",12);
		slimes[2] = new Slime("スライム2",8);
		
		System.out.println("スライムが " + slimes.length + " 匹現れた！");
		for (Slime slime : slimes) {
			System.out.println(slime.getName() + "のHPは" + slime.getHp());
		}
		
		System.out.println("");
		System.out.println("勇者のベギラマ！");
		for (Slime slime : slimes) {
			System.out.println(slime.getName() + "を倒した！");
		}
		
	}

}
