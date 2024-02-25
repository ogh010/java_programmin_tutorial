
public class Student extends Person{
	private String sutdentID;
	private int grade;
	private double GPA;
	public String getSutdentID() {
		return sutdentID;
	}
	public void setSutdentID(String sutdentID) {
		this.sutdentID = sutdentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String sutdentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.sutdentID = sutdentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("------------------------------");
		System.out.println("학생 이름:"+getName());
		System.out.println("학생 나이:"+getAge());
		System.out.println("학생 키:"+getHeight());
		System.out.println("학생 몸무게:"+getWeight());
		System.out.println("학번:"+getSutdentID());
		System.out.println("학년:"+getGPA());
		System.out.println("학점:"+getGPA());
	}
	
	
}
