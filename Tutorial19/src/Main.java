
public class Main extends Parent {
	
	// 함수 재정의 오버라이딩 똑같은함수명
	public void show() {
		System.out.println("helloW~");
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.show();
	}

}
