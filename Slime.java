
public class Slime implements Attacker, Luminous{
	
	protected String name;
	protected int hp;
	
	public Slime(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String toString() {
		return "slime [name=" + name + ", hp=" + hp + "]";
	}
	
	public void bark() {
		System.out.println("プルプル！");
	}

	@Override
	public void Attack() {
		System.out.println(this.name + " の体当たり！");
		
	}

	@Override
	public void shine() {
		System.out.println(this.name + " がほわんと光り、周囲を和ました！");
		
	}
	
	

}
