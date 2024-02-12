
public class Main {

	public static void main(String[] args) {
		String a = "I Love you";
		if (a.contains("Love")) {
			//포함하는 경우 실행되는 부분
			System.out.println("me too");
		}
		else {
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I hate you");
		}

	}

}
// 자바에서 String 은 비원시 자료형(primitive type)이 아니라 클래스형 이다. 그래서 내부적인 함수를가질 수 있다 contains
// 즉 String 은 객체로 간주한다.
