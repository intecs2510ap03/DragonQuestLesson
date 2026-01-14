
public class Day7Main {
    public static void main(String[] args) {
    	System.out.println("勇者の攻撃！");
        // メソッドを呼び出す（引数として数値を渡す）
        int damage1 = calculateDamage(4, 5); 
        System.out.println("敵に " + damage1 + " のダメージを与えた！");

        int damage2 = calculateDamage(30, 8);
        System.out.println("敵に " + damage2 + " のダメージを与えた！");
    }

    // --- ここにメソッドを定義する ---
    // static [戻り値の型] [メソッド名]([引数の型] [引数名]) { ... }
    public static int calculateDamage(int attack, int defense) {
        int result = attack - defense;
        if (result < 0) {
            result = 0; // マイナスダメージは0にする
        }
        return result; // 計算結果を返す！
    }
}