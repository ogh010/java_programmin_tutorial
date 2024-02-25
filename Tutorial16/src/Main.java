
public class Main {
	public static void main(String[] args) {
		Student[] student = new Student[100];
		for(int i=0; i<100; i++) {
			student[i] = new Student("홍길",20,270,70,"2017"+i,1,1);
			student[i].show();
		}
	}
}


