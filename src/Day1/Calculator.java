package Day1;

public class Calculator {
    public static void main(String[] args) {
        int sum = 0;

        // 1부터 100까지 더하기
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        // 결과 출력
        System.out.println("1부터 100까지의 합: " + sum + "입니다.");
    }
    }
