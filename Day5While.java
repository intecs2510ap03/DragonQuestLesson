import java.util.Scanner;

public class Day5While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean isFighting = true; // 戦い続けるかどうかのフラグ
		
		System.out.println("魔物が現れた！");
		
		while (isFighting) {
			System.out.print("1.たたかう 2.にげる ：");
			int command = scan.nextInt();
			
			if (command == 1) {
                System.out.println("勇者の攻撃！魔物にダメージを与えた！");
            } else if (command == 2) {
                System.out.println("勇者は逃げ出した！");
                // ここで isFighting を false にすれば、ループが止まりますぞ！
                isFighting = false; 
            }
			
		}
		
		System.out.println("戦闘が終了した。");
        scan.close();

	}

}
