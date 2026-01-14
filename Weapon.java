
public class Weapon {
	
	String name;
	int attack;
	
	public Weapon(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public String toString() {
		return "武器「" + this.name +  "」を鍛造した！\n攻撃力：" + this.attack;
	}
	
	

}
