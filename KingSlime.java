
public class KingSlime extends Slime {
	
	public KingSlime(String name, int hp) {
		super(name, hp);
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


	// キングスライムだけの特別な特技！
    public void bodyPress() {
        System.out.println(this.getName() + "の のしかかり攻撃！ 50のダメージ！");
    }
	
	@Override
	public String toString() {
		return "KingSlime [name=" + name + ", hp=" + hp + "]";
	}
	
	

}
