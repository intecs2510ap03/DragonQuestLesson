import java.util.Scanner;

public class Day3Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("ガライの町の道具屋へようこそ！");
        System.out.print("あなたの名前を教えてください：");
        String name = scan.nextLine(); // 文字列の入力
        System.out.println(name + "さん、いらっしゃい！");
        
        System.out.println("");

        
        System.out.print("薬草(8G)は何個買いますか？");
        int yakuso = scan.nextInt(); // 整数の入力
        
        System.out.print("毒消し草(10G)は何個買いますか？");
        int dokuso = scan.nextInt(); // 整数の入力
        
        System.out.println("");
        System.out.println("--- 計算中 ---");

        int totalPrice = yakuso * 8 + dokuso * 10; // 掛け算
        System.out.println("合計金額は" + totalPrice + " ゴールドになります！");
        System.out.println("ありがとうございました！");
        
        scan.close(); // 道具を片付ける

	}

}
