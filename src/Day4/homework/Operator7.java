package Day4.homework;

public class Operator7 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if(y == 0) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z +10;
            System.out.println("결과 : " + result);
        }
    }
}
