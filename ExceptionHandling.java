import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("１つ目の数字を入力してくださいー＞");
		try {
			num1 = scan.nextInt();

			System.out.print("２つ目の数字を入力してくださいー＞");
			num2 = scan.nextInt();
			
			System.out.println("計算を開始します");
			
			divide(num1, num2);
		}	
		catch (ArithmeticException e) {
			System.out.println("エラー発生：0で割り算はできません！");
		} catch (InputMismatchException e) {
			System.out.println("エラー発生：整数を入力してください！");
		} finally {
			System.out.println("計算を終了します");
		}

	}
	
	public static int divide(int a, int b) throws ArithmeticException {
	    return a / b;
	}

}
