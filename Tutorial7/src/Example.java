import java.util.Scanner;

public class Example {
	public void function1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력된정수는"+i+"입니다");
		sc.close();
	}
}
