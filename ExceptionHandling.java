import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args){

		Scanner scan1 = new Scanner(System.in);
		System.out.print("数字を入力してください\n１：０除算のてすと、２：独自例外のテスト->");
		int num = scan1.nextInt();
		try {
			switch(num) {
			case 1:
				calc();
				break;
			case 2:
				System.out.print("魔物のレベルを入力してください->");
				int level = scan1.nextInt();
				if (level > 100) { 
					throw new MonsterTooStrongException("強すぎ！"); 
				}
				break;
			default:
				break;
			}
		} catch (MonsterTooStrongException e) {
			System.out.println("【特殊エラー】魔物が強すぎます！逃げてください！");
		} catch (InputMismatchException e) {
			System.out.println("エラー発生：整数を入力してください！");
		} catch (Exception e) {
			System.out.println("エラー発生");
		} finally {
			System.out.println("計算を終了します");
		}
		
		
	}
	public static void calc() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("１つ目の数字を入力してくださいー＞");
		try {
			num1 = scan.nextInt();

			System.out.print("２つ目の数字を入力してくださいー＞");
			num2 = scan.nextInt();
			
			System.out.println("計算を開始します");
			
			System.out.println(divide(num1, num2));
		}	
		catch (ArithmeticException e) {
			System.out.println("エラー発生：0で割り算はできません！");
		} catch (InputMismatchException e) {
			System.out.println("エラー発生：整数を入力してください！");
		} finally {
			System.out.println("計算を終了します");
		}
		
		scan.close();
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
	    return a / b;
	}

}
