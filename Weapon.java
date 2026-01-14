
public class Weapon implements Attacker, Luminous, HolyAttacker {
	
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
	@Override
	public void Attack() {
		System.out.println(this.name + " が鋭く斬りつけた！");
		
	}
	@Override
	public void shine() {
		System.out.println(this.name + " がまばゆく光り、周囲を照らした！");
		
	}

	@Override
	public void HolyAttacker() {
		double damage = this.attack * HolyAttacker.HOLY_RATIO;
		System.out.println(this.name + "が聖なる光を纏って攻撃した！"); 
		System.out.println("ダメージ" + damage + "（基本攻撃力100 × 聖なる倍率2.0）");
	}

}
