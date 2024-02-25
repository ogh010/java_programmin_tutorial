import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
	public void function1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력된정수는"+i+"입니다");
		sc.close();
	}
	public void function2() {
		File file = new File("input.txt");
		// 예외처기 구
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*100);
			}
		} catch (FileNotFoundException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}
}
