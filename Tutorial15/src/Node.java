
public class Node {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// 생성자 ( 초기화시킴 )
	// 자동으로 값을 초기화하는것 
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getCenter 노드를 매개변수로 받음...
	// 
	public Node getCenter(Node other) {
		System.out.println(other);
		return new Node((this.x + other.getX())/2, (this.y + other.getY())/2);
	}
}
// 클래스 : 객체를 생성하기 위한 설계 도면 

// private : x와 y는 클래스 내부에서만 접근할 수 있는 개인 변수다. 
// 이러한 변수는 외부에서 직접 접근할 수 없으며, 메서드를 통해 간접적으로 접근할 수 있다. 
// 이것 정보 은닉(Encapsulation)의 한 예시다

// getX() setX() getY() setY() 
// getX() getY() 는 각각 x 와 y 값을 반환하는 메서드
// setX() setY() 는 x 와 y 의 값을 설정하는 메서드다.
// 이러한 메서드를 통해 외부에서 개인 변수에 접근할 수 있다.
