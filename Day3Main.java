import java.util.Scanner;

public class Day3Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("ガライの町へようこそ！");
        System.out.print("あなたの名前を教えてください：");
        String name = scan.nextLine(); // 文字列の入力

        System.out.print(name + "よ、薬草をいくつ買いますか？（1個8ゴールド）：");
        int count = scan.nextInt(); // 整数の入力

        int totalPrice = count * 8; // 掛け算
        System.out.println("合計で " + totalPrice + " ゴールドになります！");
        
        scan.close(); // 道具を片付ける

	}

}
