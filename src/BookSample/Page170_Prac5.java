package BookSample;

import java.util.Scanner;

public class Page170_Prac5 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하십시오.");
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();

        switch (res){
            case 1:
                System.out.println("노력이 필요합니다.");
                break;
            case 2:
                System.out.println("조금 더 노력합시다.");
                break;
            case 3:
                System.out.println("더 높은 점수를 목표로 합시다.");
                break;
            case 4:
                System.out.println("참 잘했습니다.");
                break;
            case 5:
                System.out.println("매우 우수합니다.");
                break;
        }
    }
}
