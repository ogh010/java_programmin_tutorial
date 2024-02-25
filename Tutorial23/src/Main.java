
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열생성
		Hero[] hero = new Hero[3];
		// 다형성 ( hero는 부모클래스이지만 자식클래스 인스턴스를 초기화할수있다)
		hero[0] = new Warrior("전사");
		hero[1] = new Archer("궁수");
		hero[2] = new Wizard("마법사");
		
		for(int i=0; i<hero.length; i++) {
			hero[i].attack();
			if(hero[i] instanceof Warrior) {
				Warrior temp = (Warrior) hero[i];
				temp.groundCutting();
			}
			else if(hero[i] instanceof Archer) {
				Archer temp = (Archer) hero[i];
				temp.fireArrow();
			}
			else if(hero[i] instanceof Wizard) {
				Wizard temp = (Wizard) hero[i];
				temp.freezing();
			}
		}


	}

}
