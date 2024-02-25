
public class Main {
	
	// 반환형, 함수명, 매개변수
	public static int findGCD(int a, int b) {
        // 만약 b가 0이면, a가 최대공약수
        if (b == 0) {
            return a;
        }
        // 그렇지 않으면, b와 a를 b로 나눈 나머지로 재귀 호출
        return findGCD(b, a % b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대공약수는 "+findGCD(48,18));
	}

}
