
public class Day10Main {

	public static void main(String[] args) {
		
		Slime[] s = new Slime[2];
		s[0] = new Slime("スライム",10);
		s[1] = new KingSlime("キング",50);
		
		System.out.println("--- 魔物軍団の号令！ ---");
		
		for (Slime slime : s) {
			System.out.print(slime.getName() + ":");
			slime.bark();
		}
		

	}

}
