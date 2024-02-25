
public class Archer {
	String name;
	String power;
	
	public Archer(String name,String power) {
		this.name = name;
		this.power = power;
	}
	
	// object 로 들어온 변수가 Archer와 같은지 검사하는 로
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		if(name == temp.name && power == temp.power) {
			return true;
		}
		else {
			return false;
		}
	}

}
