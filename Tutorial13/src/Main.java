import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		int[] array = new int[100];
		for(int i=0; i<100; i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값"+sum/100+"입니다");
	}	

}
