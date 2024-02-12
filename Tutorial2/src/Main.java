
public class Main {
	
	
	public static void main(String[] args) {
//		int a = (int) 0.5;
//		System.out.println(a);
		// 실수 값을 반올림할때 0.5를 더한 뒤 정수형으로 형변환 하기 
		
		double b = 0.4;
		int a = (int) (b+0.5); // 항상 반올림이 된 값으로 반
		System.out.println(a);
		
	}

}