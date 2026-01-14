
public class Weapon {
	
	String name;
	int attack;
	
	public Weapon(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}
	// パターン2：名前だけ指定する（攻撃力は初期値 5 になる）
    public Weapon(String name) {
        this.name = name;
        this.attack = 5; 
    }

    // パターン3：何も指定しない（名無しの棒きれ）
    public Weapon() {
        this.name = "ひのきのぼう";
        this.attack = 1;
    }

	public String toString() {
		return "武器「" + this.name +  "」を鍛造した！\n攻撃力：" + this.attack;
	}
	
	

}
