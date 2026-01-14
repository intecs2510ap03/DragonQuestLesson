import java.util.Scanner;

public class Day5Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("メタルスライムが現れた！");
		System.out.println("何回攻撃しますか？");
		int count = scan.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.println(i + "回目の攻撃！ メタルスライムに1のダメージ！");
			
		}
		System.out.println("メタルスライムをたおした！");
		
		scan.close();
	}

}
