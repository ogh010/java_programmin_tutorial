public class Main {
    public static void main(String[] args) {
        int radius = 5; // 반지름
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                // 피타고라스 정리를 사용하여 중심에서 현재 위치까지의 거리를 계산
                double distance = Math.sqrt(x * x + y * y);
                // 거리가 반지름과 거의 같으면 '*' 출력
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("*");
                } else {
                    // 아니면 공백 출력
                    System.out.print(" ");
                }
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
