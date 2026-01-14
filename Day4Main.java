import java.util.Scanner;

public class Day4Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("マイラの村へやってきた！");
		System.out.println("1. 宿屋  2. 温泉  3. 木のふもと");
		System.out.println("どこを調べますか？（番号を入力）：");
		int intNo = scan.nextInt();

		if (intNo == 3) {
			System.out.println("おお！「妖精の笛」を見つけた！");
		} else if (intNo == 1) {
			System.out.println("宿屋には何もなかった。");
		} else if (intNo == 2) {
			System.out.println("温泉には何もなかった。");
		} else {
			System.out.println("1~3の数字を入力してください。");
		}

		scan.close();

	}

}
