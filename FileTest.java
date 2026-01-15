import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileTest {

	public static void main(String[] args) {
		ArrayList<Attacker> partyList = new ArrayList<>();

		Slime s1 = new Slime("スライムA",10);
		Slime s2 = new Slime("スライムB",20);
		KingSlime s3 = new KingSlime("キング",30);
		Weapon s4 = new Weapon("ロトの剣");
		
		partyList.add(s1);
		partyList.add(s2);
		partyList.add(s4);
		partyList.add(s3);
		
		//現在のディレクトリを取得
		String currentDir = System.getProperty("user.dir");
		currentDir = currentDir + "\\src\\";
		
		//現在のディレクトリ＋src
		File dir = new File(currentDir);
		
		if (dir.exists()) {
			System.out.println("フォルダあり");
		}else {
			System.out.println("フォルダなし");
		}
		
		File file = new File(currentDir + "\\party.txt");
		
		if (file.exists()) {
			System.out.println("ファイルあり");
		}else {
			System.out.println("ファイルなし");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				System.out.println("ファイルの作成ができませんでした");
			}
			System.out.println("ファイル作成しました");
		}
		
		//ファイルに書き込む
		// try の後の () の中で宣言すると、ブロックを抜けるときに自動で close してくれます！
		try(PrintWriter pw = new PrintWriter(new FileWriter(file))) {
				for (Attacker attacker : partyList) {
					pw.println(attacker.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("書き込み失敗！");
			}
		}
	}		

