public class Main implements Dog,Cat{

	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	
	


}
